package com.examples.spring.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import com.examples.spring.dao.EmployeeDao;
import com.examples.spring.model.Employee;

public class EmployeeService {
	
	ArrayList<Employee> employeeList = new ArrayList<Employee>();
	EmployeeDao db = new EmployeeDao();
	java.util.Scanner sc= new java.util.Scanner(System.in);

	public void add(Employee employee) throws SQLException {
		db.addEmployee(employee);
				
	}

	public ArrayList<Employee> viewAll() throws SQLException {
		//System.out.println("Called service");
		ArrayList<Employee> empList = db.displayEmployee();
		return empList;
		
	}

	public void update(Employee emp) throws SQLException {
		db.updateEmployee(emp);
		
	}

	public void delete(int id) throws SQLException {
		
		db.deteleEmployee(id);
		
		
	}

	public void view(int id) throws SQLException {
		
			db.viewEmployee(id);
	}

}