package com.collection6;

public class Employee {

	
	int empId;double empSal;
	String empName,designation,insuScheme;
	
	
	
	public Employee(int empId, double empSal, String empName, String designation) {
		super();
		this.empId = empId;
		this.empSal = empSal;
		this.empName = empName;
		this.designation = designation;
		
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpId() {
		return empId;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuScheme() {
		return insuScheme;
	}
	public void setInsuScheme(String insuScheme) {
		this.insuScheme = insuScheme;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
