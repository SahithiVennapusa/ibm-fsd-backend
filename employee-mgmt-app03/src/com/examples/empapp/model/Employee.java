package com.examples.empapp.model;


public class Employee {




	private int id;
	private String name;
	private String designation;
//	private String department;
	private String country;
	
	
	public void setId(int id){
		this.id=id;
		
	}
	
	public void setName(String  name){
		this.name=name;
		
	}
	
	
	public void setDesignation(String designation){
		this.designation=designation;
		
	}
	
	
	public void setCountry(String country){
		this.country=country;
		
	}
	
	
	
	public int getId(){
		return id;
		
	}
	
	public String getName(){
		return name;
		
	}
	
	
	public String getDesignation(){
		return designation;
		
	}
	
	
	public String getCountry(){
		return country;
		
	}
	
	
	}