package com.examples.java.view;

import java.util.Scanner;

import com.examples.java.service.EmployeeService;
import com.examples.java.view.Employee;

public class EmployeeMain {
	static Scanner sc=new Scanner(System.in);
	
	public static Employee takeInput() {
		System.out.println("Enter Id");
		int Id=sc.nextInt();
		System.out.println("Enter Name");
		String Name=sc.next();
		System.out.println("Enter Age");
		int Age=sc.nextInt();
		System.out.println("Enter Designation");
		String Design=sc.next();
		System.out.println("Enter Department");
		String Dept=sc.next();
		System.out.println("Enter Country");
		String Country=sc.next();
		Employee newEmp = new Employee(Id, Name, Age, Design, Dept, Country);
		return newEmp;
	}

	public static void main(String[] args) {
		int choice;
		EmployeeService eService = new EmployeeService();      
		do {
			System.out.println("Enter 1 to add, 2 to view, 3 to update, 4 to delete, 5 to view all, 6 to import, 7 to export, 10 to exit");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					Employee e = takeInput();
					eService.addNewEmp(e);
					break;
				case 2:
					System.out.println("Enter Emp Id");
					int x= sc.nextInt();
					eService.view(x);
					break;
				case 3:
					System.out.println("Enter Emp Id");
					x= sc.nextInt();
					e = takeInput();
					eService.update(x,e);
					break;
				case 4:
					System.out.println("Enter Emp Id");
					x= sc.nextInt();
					eService.delete(x);
					break;
				case 5:
					eService.viewAllEmployees();
					break;
				case 6:
					eService.importEmployees();
					break;
				case 7:
					eService.exportEmployees();
					break;
				case 10:
					System.out.println("Exit");
				default:
					System.out.println("Invalid entry please try again!!");
			}
			
			
		}while(choice!=10);
	}

}