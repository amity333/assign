package com.cg.eis.bean;

public class Employee {

	
	public int id;
	public String name;
	public double salary;
	public String designation;
	public String insuranceScheme;
	
	public Employee() {
		name="";
		designation="";
		insuranceScheme="";
		salary=0;
	}
	public Employee(int id, String name, double salary, String designation) {
	
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	
	
	
	
}
