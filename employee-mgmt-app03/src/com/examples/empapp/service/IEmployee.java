package com.examples.empapp.service;

import java.util.ArrayList;

import com.examples.empapp.model.Employee;

public interface IEmployee {

	public void addEmployee(Employee epojo);
	public Employee viewEmployee(int id);
	public void updateEmployee(Employee e);
	public void deleteEmployee(int id);
	public ArrayList<Employee> viewAllEmployee();
	public void importEmpl();
	public void exportEmpl();
	
	
}
