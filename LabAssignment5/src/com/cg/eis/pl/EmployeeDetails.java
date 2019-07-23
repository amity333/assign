package com.cg.eis.pl;
import com.cg.eis.service.*;
import com.cg.eis.exception.*;
import java.util.*;

public class EmployeeDetails {

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your id");
		int id=s.nextInt();
		System.out.println("Enter your name");
		String name=s.next();
		System.out.println("Enter your salary");
		double salary=s.nextDouble();
		System.out.println("Enter your designation");
		String designation=s.next();
		
		
		Service a1=new Service(id,name,salary,designation);
		try {
		a1.salCheck(salary);
		}
		catch(EmployeeException e) {
			System.out.println(e.getMessage());	
		}
		
		a1.insuranceDetails(salary, designation);
		s.close();
		
		
	}
}
