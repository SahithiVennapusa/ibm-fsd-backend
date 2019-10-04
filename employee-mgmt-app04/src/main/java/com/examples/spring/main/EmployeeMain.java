package com.examples.spring.main;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.examples.spring.config.EmployeeConfig;
import com.examples.spring.model.Employee;
import com.examples.spring.service.EmployeeService;


public class EmployeeMain {
	static java.util.Scanner scan = new java.util.Scanner(System.in);
	
	

	public static Employee getDetails() {
		System.out.println("Enter id: ");
		int id = scan.nextInt();
		System.out.println("Enter name: ");
		String name= scan.next();
		System.out.println("Enter designation: ");
		String des = scan.next();
		System.out.println("Enter salary: ");
		String sal = scan.next();
		Employee employee = new Employee(id,name,des,sal);
		return employee;
		
	}
	
	public static int idReturn()
	{
		System.out.println("Enter ID of the employee: ");
		int id = scan.nextInt();
		return id;
	}
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
			
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		Employee empBean = (Employee) context.getBean("employee");
		EmployeeService eser = (EmployeeService) context.getBean("empserv");

		while(true)
		{
			System.out.println("1.Add Employee\n2.View employees\n3.Update employee\n4.View employee\n5.Delete employee\n6.Exit");
			System.out.println("Enter your choice:");
			
			int choice = scan .nextInt();
			
			switch(choice)
			{
			case 1: empBean = getDetails();
					eser.add(empBean);
					break;
			case 2: eser.viewAll();
					break;
			case 3: empBean= getDetails();
					eser.update(empBean);
					break;
			case 4: int i = idReturn();
					eser.view(i);
					break;
			case 5: int i1 = idReturn();
					eser.delete(i1);
					break;
			case 6: System.exit(0);
					break;
			default: System.out.println("Invalid choice.");
					break;
			
			}
			
			
		}

	}

}
