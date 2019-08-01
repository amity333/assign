package com.cg.ems.service;

import java.util.ArrayList;

import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;

public interface EmployeeService 
{
    public int addEmp(Employee emp) throws EmployeeException;
		
	public ArrayList<Employee> getAllEmp();
	
	public int deleteEmp(int empId) throws EmployeeException ;
	public Employee getEmpById(int empId) throws EmployeeException;
	public Employee updateemp(int empId,Employee UpdatedEmp);
	
	public boolean validateEmpId(int empId) throws EmployeeException;
	
	public boolean validateName(String empName) throws EmployeeException;

}
