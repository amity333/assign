package com.collection2;
import java.util.*;
public class MainOperationList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter S1: ");
		String S1=s.next();
		System.out.println("Enter S2: ");
		String S2=s.next();
		
		OperationStringObject obj1=
				new OperationStringObject();
		System.out.println(obj1.Operations(S1,S2));
		
		s.close();
	}

}
