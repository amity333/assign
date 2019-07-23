package com.string2;
import java.util.Scanner;

public class positiveString {

	public static boolean positiveS(String b)
	{
		boolean c=true;
		String a=b.toLowerCase();
		for (int i = 0; i< a.length(); i++) {
			int count=1;
               for (int j = i+1; j < a.length(); j++) {
		           if (a.charAt(i) >= a.charAt(j)) {
		        	 count++;	
		           }
		       }
               if(count==1)
            	   c=true;
               else 
            	   c= false;
		}
		return c;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name:");
		String name=s.next();
		if(positiveS(name)==true)
		    System.out.println("positive");
		else
			System.out.println("negative");
		s.close();
			
		

	}

}
