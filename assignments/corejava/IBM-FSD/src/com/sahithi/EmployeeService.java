package com.sahithi;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeService {
	ArrayList<Employee> employeeList = new ArrayList<Employee>();
	Scanner sc= new Scanner(System.in);

	public void add() {
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Enter name: ");
		String name= sc.next();
		System.out.println("Enter designation: ");
		String designation = sc.next();
		System.out.println("Enter salary: ");
		String salary = sc.next();
		Employee employee = new Employee(id,name,designation,salary);
		employeeList.add(employee);
		
	}

	public void viewAll() {
		
		for(Employee e : employeeList)
		{
			System.out.println("ID: "+e.getId()+" Name: "+e.getName()+" Designation: "+e.getDes()+" Salary: "+e.getSal());
			
		}
		
	}

	public void update() {
		Employee echange = null;
		System.out.println("Enter ID of the employee to be updated: ");
		int id = sc.nextInt();
		for(Employee e : employeeList) {
			if(id == e.getId())
			{
				 echange = e;
				 System.out.println("1.Update name\n2.Update designation\n3.Update salary\n");
					System.out.println("Enter choice: ");
					int ch = sc.nextInt();
					switch(ch)
					{
					case 1: System.out.println("Enter name: ");
							String cname = sc.next();
							echange.setName(cname);
						break;
					case 2: System.out.println("Enter designation: ");
							String cdes = sc.next();
							echange.setDes(cdes);
						break;
					case 3: System.out.println("Enter salary: ");
							String csal = sc.next();
							echange.setSal(csal);
						break;
					default: System.out.println("Invalid choice");
						break;
					}
					break;
				
			}
			else
			{
				System.out.println("Employee doesn't exist. Cannot update.");
				break;
			
			}
		}
		
		
	}

	public void delete() {
		
		System.out.println("Enter ID of the employee to be deleted: ");
		int id = sc.nextInt();
		for(Employee e : employeeList) {
			if(id == e.getId())
			{
				employeeList.remove(e);
				break;
				
			}
		}
		
		
	}

	public void view() {
		
		System.out.println("Enter ID of the employee to be displayed: ");
		int id = sc.nextInt();
		for(Employee e : employeeList) {
			if(id == e.getId())
			{
				System.out.println("ID: "+e.getId()+" Name: "+e.getName()+" Designation: "+e.getDes()+" Salary: "+e.getSal());
				break;
				
			}
			else
			{
				System.out.println("Employee doesn't exist.");
				break;
			}
		}
		
		
	}

}
