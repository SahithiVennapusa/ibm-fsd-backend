package com.sahithi;

public class Employee {
	
	private int id;
	private String name;
	private String designation;
	private String salary;
	
	Employee(int id, String name, String designation, String salary){
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return designation;
	}

	public void setDes(String designation) {
		this.designation = designation;
	}

	public String getSal() {
		return salary;
	}

	public void setSal(String salary) {
		this.salary = salary;
	}


}