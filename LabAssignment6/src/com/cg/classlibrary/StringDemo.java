package com.cg.classlibrary;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1=new String("India");
		String str2="India";
		String str3="India";
		if(str1==str2)
			System.out.println("str1 and str2 are equal");
		else
			System.out.println("str1 and str2 are not equal");
		if(str2==str3)
			System.out.println("str2 and str3 are equal");
		else
			System.out.println("str2 and str3 are not equal");
	}

}
