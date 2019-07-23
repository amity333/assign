package com.string7;
import java.util.Scanner;

public class UserNameValidation {

	
	public static boolean validateUserName(String a)
	{
		if(a.length()-4>=8 && 
				a.substring(a.length()-4).equals("_job"))
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter username");
		String a=s.nextLine();
		if(validateUserName(a)==true)
			System.out.println("Valid username");
		else
			System.out.println("Invalid username");
		s.close();
	}

}
