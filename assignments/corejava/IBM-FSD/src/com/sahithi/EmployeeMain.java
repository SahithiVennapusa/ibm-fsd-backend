package com.sahithi;
import java.util.Scanner;
public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeService emp = new EmployeeService();
		while(true)
		{
			System.out.println("1.Add Employee\n2.View employees\n3.Update employee\n4.View employee\n5.Delete employee\n6.Exit");
			System.out.println("Enter your choice:");
			Scanner a = new Scanner(System.in);
			int choice = a .nextInt();
			
			switch(choice)
			{
			case 1: emp.add();
				break;
			case 2: emp.viewAll();
				break;
			case 3: emp.update();
				break;
			case 4: emp.view();
				break;
			case 5: emp.delete();
				break;
			case 6: System.exit(0);
				break;
			default: System.out.println("Invalid choice.");
				break;
			
			}
			
			
		}

	}

}
