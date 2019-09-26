package com.examples.empapp.service;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.examples.empapp.dao.EmployeeDao;
import com.examples.empapp.model.Employee;

public class EmployeeService implements IEmployee {

	EmployeeDao dao=new EmployeeDao();
	Scanner sc = new Scanner(System.in);
	HashMap<Integer,Employee> eMap=new HashMap<Integer,Employee>();
	
	
	@Override
	public void addEmployee(Employee epojo) {
		eMap.put(epojo.getId(),epojo);
		dao.addToDatabase(epojo);
	}
	
	@Override
	public Employee viewEmployee(int id){
		
		Employee e =dao.viewEmployeeFromDatabase(id);
		
		 

		return e;
	}
	@Override
	public void updateEmployee(Employee e){
		
		
		
	
		dao.updateEmployeeFromDatabase(e);

		
	}
	
	@Override
	public void deleteEmployee(int id){

		
		dao.deleteEmployeeFromDatabase(id);
	}	
			
	
	
	@Override
	public ArrayList<Employee>viewAllEmployee(){
		
		ArrayList<Employee> eArr=dao.viewAllEmployeeFromDatabase();

		return eArr;
	}
	
	
	@Override
	
	public void importEmpl() 
	{
		
		System.out.println("Hi");
         
		try {
            sc = new Scanner(new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\NakulGNair\\Desktop\\FSD\\Trainer-4\\ibm-fsd-backend\\assignments\\corejava\\employee-mgmt-app01\\src\\Employee.txt"))));
			
            while (sc.hasNextLine()) {
            	
            	String [] arr= sc.nextLine().split(",");
            	Employee epojo=new Employee();
            	

            	
            	
                epojo.setId(Integer.parseInt(arr[0]));
                epojo.setName(arr[1]);
                epojo.setDesignation((arr[2]));
                epojo.setCountry((arr[3]));
                

                dao.importToDatabase(epojo);
            }
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		finally {
            if (sc != null) {
                sc.close();
            }
	}
	}
	
	
	
	public void exportEmpl()
	{

		
		

		try {
			
			File fout = new File("C:\\Users\\NakulGNair\\Desktop\\FSD\\Trainer-4\\ibm-fsd-backend\\assignments\\corejava\\employee-mgmt-app02\\src\\EmployeeExport.txt");
			FileOutputStream fos = new FileOutputStream(fout);
		 


		String result	=dao.exportToDatabase();
		fos.write(result.getBytes());
		fos.close();
		}
		
		
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		
	}
	
	
	
}