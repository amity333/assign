package com.cg.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.util.DBUtil;
import com.cg.ems.util.MyStringDateUtil;

public class EmployeeDaoImpl implements EmployeeDao
{
	Connection con=null;
	Statement st=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	
	@Override
	public int addEmp(Employee emp) throws EmployeeException 
	{
		
		java.sql.Date sqlDOB=MyStringDateUtil.fromLocalToSqlDate(emp.getEmpDOB());
		
		con=DBUtil.getCon();
		//System.out.println("con = ");
		int dataInserted=0;
		try {
			 
			pst=con.prepareStatement(QueryMapper.EMP_INSERT_QRY);
			
			pst.setInt(1, emp.getEmpId());
		    pst.setString(2, emp.getEmpname());
			pst.setFloat(3, emp.getEmpsal());
			pst.setDate(4,sqlDOB);
			dataInserted=pst.executeUpdate();
			
		} 
		catch (SQLException e) {
			
			throw new EmployeeException("addemp from daoImpl");
		}
		
		return dataInserted;
	}
	
	@Override
	public ArrayList<Employee> getAllEmp() 
	{
         ArrayList<Employee> list = new ArrayList<Employee>();
                       
        try
         {
        	try {
				con=DBUtil.getCon();
			} catch (EmployeeException e) {
				
				e.printStackTrace();
			}
			st=con.createStatement();
			rs=st.executeQuery(QueryMapper.EMP_SELECTALL);
			
			while(rs.next())
			{
				list.add(new Employee(rs.getInt("emp_id"),rs.getString("emp_name"),rs.getFloat("emp_sal")));
			}
		 }
         catch (SQLException e)
         {
			
			e.printStackTrace();
		 }
         
		return list;
	}
	
	
	@Override
	public int deleteEmp(int empId) throws EmployeeException 
	{
			
		con=DBUtil.getCon();
		
		int dataInserted=0;
		try {
			 		
			pst=con.prepareStatement(QueryMapper.EMP_DEL_QRY);
			pst.setInt(1, empId);
		
			dataInserted=pst.executeUpdate();
			
		} 
		catch (SQLException e) {
			
			throw new EmployeeException("deleteemp from daoImpl");
		}
		
		return dataInserted;
			
	}
	
	@Override
	public Employee getEmpById(int empId) throws EmployeeException {

		con=DBUtil.getCon();
		
		ResultSet rs=null;
		Employee emp=null;		
		
		try {			 
			pst=con.prepareStatement(QueryMapper.EMP_SAL_BYID);
			
			pst.setInt(1, empId);
		 			
			rs=pst.executeQuery();
			
			while(rs.next())
			{
				emp=new Employee(rs.getInt("emp_id"),rs.getString("emp_name"),rs.getFloat("emp_sal"));
			}
			
		} 
		catch (SQLException e) {
			
			throw new EmployeeException("addemp from daoImpl");
		}
		
		return emp;
		
	}
	
	
	@Override
	public Employee updateemp(int empId,Employee updatedEmp) {
		
		return null;
	}
	
	}
