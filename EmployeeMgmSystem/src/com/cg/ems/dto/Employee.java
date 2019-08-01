package com.cg.ems.dto;

import java.time.LocalDate;

public class Employee 
{
	private int empId;
	private String empname;
	private float empsal;
	private LocalDate empDOB;
	
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpname() {
		return empname;
	}
	
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
	public float getEmpsal() {
		return empsal;
	}
	
	public void setEmpsal(float empsal) {
		this.empsal = empsal;
	}
	
	public LocalDate getEmpDOB() {
		return empDOB;
	}
	
	public void setEmpDOB(LocalDate empDOB) {
		this.empDOB = empDOB;
	}
	
	public Employee(int empId, String empname, float empsal) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.empsal = empsal;
	}
	
	
	public Employee(int empId, String empname, float empsal, LocalDate empDOB) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.empsal = empsal;
		this.empDOB = empDOB;
	}
	
	public Employee() {
		super();
		
	}
	@Override
	
	public String toString() {
		return "Employee [empId=" + empId + ", empname=" + empname + ", empsal=" + empsal + ", empDOB=" + empDOB + "]";
	}
	
	

}
