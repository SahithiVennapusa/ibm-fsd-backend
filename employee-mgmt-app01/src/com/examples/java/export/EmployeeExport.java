package com.examples.java.export;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.examples.java.employee.Employee;

public class EmployeeExport extends Thread{
	List<Employee> employeeList = new ArrayList<Employee>();
	public void run() {
		
		//String line = "";
		File file = new File("C:\\Training\\ibm-fsd-backend\\Assignments\\corejava\\Employee-mgmt-App01\\src\\com\\sahithi\\employee_exported_data.txt");
		FileWriter fr;
		try {
			fr = new FileWriter(file, true);
			BufferedWriter br = new BufferedWriter(fr);
			PrintWriter pr = new PrintWriter(br);
			employeeList.forEach(e -> {
				String line = e.getId()+","+e.getName()+","+e.getAge()+","+e.getDesign()+","+e.getDept()+","+e.getCountry();
				System.out.println(line);
				pr.println(line);
			});
			pr.close();
			br.close();
			fr.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	public List<Employee> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
}
