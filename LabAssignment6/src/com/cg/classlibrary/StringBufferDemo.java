package com.cg.classlibrary;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer obj1 = new StringBuffer("Hello");
		StringBuffer obj2 = new StringBuffer("All");
		
		System.out.println("obj before"+obj1);
		obj1.append(obj2);
		System.out.println("obj after"+obj1);
	}

}
