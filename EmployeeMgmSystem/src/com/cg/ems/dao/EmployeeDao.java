package com.cg.ems.dao;

import java.util.ArrayList;

import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;

public interface EmployeeDao 
{
	public int addEmp(Employee emp) throws EmployeeException;
	
	//public EmployeeException;
	
	public ArrayList<Employee> getAllEmp();
	
	public int deleteEmp(int empId) throws EmployeeException;
	public Employee getEmpById(int empId) throws EmployeeException;
	public Employee updateemp(int empId,Employee UpdatedEmp);

}
