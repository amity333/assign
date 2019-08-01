package com.cg.ems.ui;
import java.util.ArrayList;
import java.util.Scanner;

import com.cg.ems.dto.Employee;
import com.cg.ems.exception.EmployeeException;
import com.cg.ems.service.EmployeeService;
import com.cg.ems.service.EmployeeServiceImpl;
import com.cg.ems.util.MyStringDateUtil;

public class TestEmpMgmDemo {

	static Scanner sc = new Scanner(System.in);
	
	static EmployeeService empService=null;
	
	public static void main(String[] args) 
	{
		empService=new EmployeeServiceImpl();
		
		
		int choice; 
		
	    while(true)
	    {
	    	System.out.println("what do u want to do ?");
		    System.out.println("1.addEmp\n2.Fetch all emp\n3.delete emp \n4.get emp by id\n5.exit");
		    
		    choice=sc.nextInt();
		    
		    switch(choice)
		    {
		        
		    case 1:InsertEmp();
		           break;
		    //default:System.exit(1);
		    case 2:FetchAllEmp();
		           break;
		    case 3:DeleteEmp();
		           break;
		    case 4:EmpbyId();
		           break;
		    }
	    }

	}

	private static void EmpbyId() 
	{
		System.out.println("enter emp id: ");
	    int eid=sc.nextInt();
	    //int dataAdd;
	    try {
			System.out.println(empService.getEmpById(eid));
		} catch (EmployeeException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	private static void DeleteEmp() 
	{
		
		System.out.println("enter emp id: ");
	    int eid=sc.nextInt();
	    int dataAdd;
	    
		try {
			dataAdd = empService.deleteEmp(eid);
			
			if(dataAdd==1)
			{
				System.out.println("data deleted");
			}
			else
			{
				System.out.println("some error in deletion");
			}
		} 
		catch (EmployeeException e) 
		{
			 
			e.printStackTrace();
		}
					
	}

	private static void FetchAllEmp() 
	{
		ArrayList<Employee> list= new ArrayList<Employee>();
		list=empService.getAllEmp();
		
		System.out.println("EMPID\t\tEMPNAME\t\tEMPSAL");
		for(Employee e1 : list)
			System.out.println(e1);
				
	}

	private static void InsertEmp() 
	{
		System.out.println("enter emp id: ");
		int eid=sc.nextInt();
		try {
			
			if(empService.validateEmpId(eid))
			{
				System.out.println("enter emp Name: ");
				String ename=sc.next();
				
				if(empService.validateName(ename))
				{
					System.out.println("enter emp Salary: ");
					float esal=sc.nextFloat();
					
					System.out.println("enter emp dob in dd-mm-yyyy: ");
					String strDOB=sc.next();
					
					Employee ee = new Employee(eid,ename,esal);
					
					ee.setEmpDOB(MyStringDateUtil.fromStringToLocalDate(strDOB));
					
					int dataAdd=empService.addEmp(ee);
					//System.out.println(dataAdd);
					if(dataAdd==1)
					{
						System.out.println("data inserted");
					}
					else
					{
						System.out.println("some error in insert");
					}
				}
				
			}
		}
		
		catch (EmployeeException e)
		{
			System.out.println(e.getMessage());
		}
		
	
		
		
		
	}

}
