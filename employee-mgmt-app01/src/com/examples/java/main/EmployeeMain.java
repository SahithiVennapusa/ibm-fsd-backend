package com.examples.java.main;


import com.examples.java.service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) throws InterruptedException {
		
		EmployeeService e = new EmployeeService();
		e.start();

	}

}
