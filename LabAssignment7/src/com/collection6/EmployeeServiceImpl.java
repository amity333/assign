package com.collection6;
import java.util.*;

public class EmployeeServiceImpl {

	
	HashMap<String,Employee> map=new HashMap<String,Employee>();
	
	public static void main(String args[]) {
		//code to add employee
		
		HashMap<String,Employee> map=new HashMap<String,Employee>();
		Scanner s=new Scanner(System.in);
		
		Employee emp1=new Employee(110,50000,"Amit","Manager");
		Employee emp2=new Employee(120,30000,"rahul","Programmer");
		Employee emp3=new Employee(119,4000,"vinit","Clerk");
		
		map.put(emp1.getEmpName(),emp1);
		map.put(emp2.getEmpName(),emp2);
		map.put(emp3.getEmpName(),emp3);
		
		System.out.println("employee1:"+map.get(emp1.getEmpName()));
		System.out.println("employee2:"+map.get(emp2.getEmpName()));
		System.out.println("employee3:"+map.get(emp3.getEmpName()));
		
		
			// code to delete a employee whose id is passed as 
			//parameter
		    System.out.println("enter id to delete:");
		    int id=s.nextInt();
			if(emp1.empId==id) {
			map.remove(emp1.getEmpName());}
			if(emp2.empId==id) {
				map.remove(emp2.getEmpName());}
			if(emp3.empId==id) {
			map.remove(emp3.getEmpName());}
			
			
			
			}
		}
	

