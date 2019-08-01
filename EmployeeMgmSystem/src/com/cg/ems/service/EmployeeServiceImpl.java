package com.cg.ems.service;

import java.util.ArrayList;
import java.util.regex.Pattern;

import com.cg.ems.dao.EmployeeDao;
import com.cg.ems.dao.EmployeeDaoImpl;
import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;

public class EmployeeServiceImpl implements EmployeeService
{

	EmployeeDao empDao=null;
	public EmployeeServiceImpl()
	{
		empDao=new EmployeeDaoImpl();
	}
	
	public int addEmp(Employee emp) throws EmployeeException 
	{
	
		return empDao.addEmp(emp);
	}

	public ArrayList<Employee> getAllEmp() 
	{
		
		return empDao.getAllEmp();
	}

	public int deleteEmp(int empId) throws EmployeeException 
	{
		
		return empDao.deleteEmp(empId);
	}

	public Employee getEmpById(int empId) throws EmployeeException
	{
		
		return empDao.getEmpById(empId);
	}

	public Employee updateemp(int empId, Employee UpdatedEmp) 
	{
		
		return empDao.updateemp(empId,UpdatedEmp);
	}

	public boolean validateEmpId(int empId) throws EmployeeException
	{
	
		String empIdData=new Integer(empId).toString();
		String empIdPattern="[0-9]{6}";
		if(Pattern.matches(empIdPattern,empIdData))
		{
			return true;
		}
		else
		{
			throw new EmployeeException("invalid empid,"+"should have only 6 digit");
		}
		
	}

	public boolean validateName(String empName) throws EmployeeException
	{

		//String empIdData=new Integer(empId).toString();
		String empNamePattern="[A-Z][a-z]+";
		if(Pattern.matches(empNamePattern,empName))
		{
			return true;
		}
		else
		{
			throw new EmployeeException("invalid name,"+"should start with capital");
		}
		
		
	}
	

}
