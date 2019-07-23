package com.cg.classlibrary;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1=new String("Hello");
		String str2=new String("Welcome to CG");
		
		System.out.println("str1 length:"+str1.length());
		System.out.println("str2 length:"+str2.length());
		System.out.println("index of o in str2:"+str2.indexOf("o"));
		System.out.println("last index of o in str2:"+str2.lastIndexOf("o"));
		System.out.println("str1 lower:"+str1.toLowerCase());
		System.out.println("str1 upper:"+str2.toUpperCase());
		System.out.println("str2sub 0 to 2:"+str2.substring(0,3));
		System.out.println("str1str2 concat:"+str1.concat(str2));
		System.out.println("str1:"+str1);
		System.out.println("str2 trim:"+str2.trim());
		System.out.println("str2:"+str2);
	}

}
