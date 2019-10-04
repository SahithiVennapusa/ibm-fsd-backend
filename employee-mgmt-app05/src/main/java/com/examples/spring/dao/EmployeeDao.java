package com.examples.spring.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.examples.spring.model.Employee;

public class EmployeeDao {
	
	  static Connection conn = null;
		static Statement stmt = null;
		static PreparedStatement pstmt = null;
		static ResultSet rs = null;
		
		public EmployeeDao(){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","training","training");
								
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	
		public void addEmployee(Employee employee) throws SQLException
	{
		
		int id = employee.getId();
		String name = employee.getName();
		String des = employee.getDes();
		String sal = employee.getSal();
		 String query = " insert into details (id,name, designation,salary)"
			        + " values (?, ?, ?, ?)";
		 PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setInt (1, id);
	      preparedStmt.setString (2, name);
	      preparedStmt.setString (3, des);
	      preparedStmt.setString (4, sal);
	      
		preparedStmt.execute();
		System.out.println("Employee added successfully.");
		//conn.close();
		
	}
	
	public ArrayList<Employee> displayEmployee() throws SQLException
	{	
		System.out.println("Called db");
		ArrayList<Employee> listemployees = new ArrayList<Employee>();
		 String query = " select * from  details";
		 PreparedStatement preparedStmt = conn.prepareStatement(query);
		 ResultSet rs = preparedStmt.executeQuery();
		
		
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String designation = rs.getString("designation");
				String salary = rs.getString("salary");
				
				Employee emp = new Employee(id,name,designation,salary);
				listemployees.add(emp);
				
				

//				System.out.format("\t%d \t%s \t%s \t%s\n", id, name, designation, salary);
			}
			System.out.println(listemployees);
			return listemployees;
	}

	public void deteleEmployee(int id) throws SQLException {
		// TODO Auto-generated method stub
		
		 String query = " delete from  details where id = ?";
		 PreparedStatement preparedStmt = conn.prepareStatement(query);
		 preparedStmt.setInt(1, id);
		 preparedStmt.executeUpdate();		
		 System.out.println("Employee deleted successfully.");
		
	}
	public List<Employee> exportEmployees() throws SQLException
	{
		ArrayList<Employee> emplist = new ArrayList<Employee>();
			
		 String query = " select * from  details";
		 PreparedStatement preparedStmt = conn.prepareStatement(query);
		 ResultSet rs = preparedStmt.executeQuery();
		
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String designation = rs.getString("designation");
				String salary = rs.getString("salary");
				Employee newemp = new Employee(id,name,designation,salary);
				emplist.add(newemp);
			}
		return emplist;
	
	}

	public void viewEmployee(int num) throws SQLException {
		// TODO Auto-generated method stub
		 String query = " select * from  details";
		 PreparedStatement preparedStmt = conn.prepareStatement(query);
		 ResultSet rs = preparedStmt.executeQuery();
		
			while (rs.next()) {
				int id = rs.getInt("id");
				if(num == id)
				{
					String name = rs.getString("name");
					String designation = rs.getString("designation");
					String salary = rs.getString("salary");

					// Display values
					System.out.format("\t%d \t%s \t%s \t%s\n", id, name, designation, salary);
					break;
					
				}
				else
				{
					System.out.println("Id doesn't exists. Please enter a valid Id.");
					break;
				}
				
			}
		 
	}

	public void updateEmployee(Employee emp) throws SQLException {
		// TODO Auto-generated method stub
		String query = " update details set name=?,designation=?,salary=? where id=?";
		 PreparedStatement preparedStmt = conn.prepareStatement(query);

			 preparedStmt.setString(1,emp.getName());
			 preparedStmt.setString(2,emp.getDes());
			 preparedStmt.setString(3,emp.getSal());
			 preparedStmt.setInt(4,emp.getId());
		 int rows = preparedStmt.executeUpdate();	
		 
		 System.out.println("Employee updated successfully.");
		 
			}	
	}
