package com.examples.java.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.examples.java.employee.Employee;
import com.examples.java.export.EmployeeExport;
import com.examples.java.import1.EmployeeImport;

public class EmployeeService {
	List<Employee> empList = new ArrayList<Employee>();
	public void start() throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("Enter 1 to add, 2 to view, 3 to update, 4 to delete, 5 to view all, 6 to import, 7 to export, 10 to exit");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					addNewEmp();
					break;
				case 2:
					System.out.println("Enter Emp Id");
					int x= sc.nextInt();
					view(x);
					break;
				case 3:
					System.out.println("Enter Emp Id");
					x= sc.nextInt();
					update(x);
					break;
				case 4:
					System.out.println("Enter Emp Id");
					x= sc.nextInt();
					delete(x);
					break;
				case 5:
					viewAll();
					break;
				case 6:
					importEmployees();
					break;
				case 7:
					exportEmployees(empList);
					break;
				case 10:
					System.out.println("Exiting...");
				default:
					System.out.println("Invalid entry please try again!!");
			}
			
			
		}while(choice!=10);
	}
	private void exportEmployees(List empList) throws InterruptedException {
		EmployeeExport e_Export = new EmployeeExport();
		e_Export.employeeList=empList;
		e_Export.start();
		e_Export.join();
		
	}
	private void importEmployees() throws InterruptedException {
		EmployeeImport e_import = new EmployeeImport();
		e_import.start();
		e_import.join();
		empList=e_import.employeeList;
	}
	public void addNewEmp() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id");
		int nId=sc.nextInt();
		System.out.println("Enter Name");
		String nName=sc.next();
		System.out.println("Enter Age");
		int nAge=sc.nextInt();
		System.out.println("Enter Designation");
		String nDesign=sc.next();
		System.out.println("Enter Department");
		String nDept=sc.next();
		System.out.println("Enter Country");
		String nCountry=sc.next();
		Employee newEmp = new Employee(nId, nName, nAge, nDesign, nDept, nCountry);
		empList.add(newEmp);
	}
	public void view(int x) {
		try {
			if(x>empList.get(empList.size()-1).getId()) {
				throw new InvalidIdException("Enter valid id");
			}
			else {
				empList.forEach(e->{
					if(e.getId()==x) {
						System.out.println(e);
				}});
			}
		}
		catch(InvalidIdException e) {
			System.out.println(e.getMessage());
		}
	}
	public void update(int x) {
		try {
			if(x>empList.get(empList.size()-1).getId()) {
				throw new InvalidIdException("Enter valid id");
			}
			else {
				List<Employee> tempEmpList = new ArrayList<Employee>();
				empList.forEach(e-> {
					if(e.getId() != x) {
						tempEmpList.add(e);
					}
					else {
						System.out.println(e);
					}
				});
				empList=tempEmpList;
				addNewEmp();
			}
		}
		catch(InvalidIdException e) {
			System.out.println(e.getMessage());
		}
	}
	public void delete(int x) {
		try {
			if(x>empList.get(empList.size()-1).getId()) {
				throw new InvalidIdException("Enter valid id");
			}
			else {
				List<Employee> tempEmpList = new ArrayList<Employee>();
				empList.forEach(e->{
					if(e.getId()!=x) {
						tempEmpList.add(e);
					}
				});
				empList=tempEmpList;
			}
		}
		catch(InvalidIdException e) {
			System.out.println(e.getMessage());
		}
	}
	public void viewAll() {
		empList.forEach(e->{
			System.out.println(e);
		});
	}
	
	

}
