package com.cg.classlibrary;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter name:");
String name=s.next();
System.out.println("Enter age:");
int age=s.nextInt();

System.out.println("details are:");
System.out.println("name:"+name);
System.out.println("age:"+age);
s.close();
String data="Helo-How-Are-You";
Scanner s1=new Scanner(data);
s1.useDelimiter("-");
while(s1.hasNext())
	System.out.println(s1.next());
s1.close();
	}

}
