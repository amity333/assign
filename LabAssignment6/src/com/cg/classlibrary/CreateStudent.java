package com.cg.classlibrary;

class CreateStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu1=new Student(12,"Karan");
		Student stu2=new Student(12,"Karan");
		
		if(stu1.equals(stu2))
			System.out.println("stu1 stu2 equal");
		else
			System.out.println("not equal");
		System.out.println("stu1="+stu1);
		System.out.println("stu2="+stu2);
	}

}
