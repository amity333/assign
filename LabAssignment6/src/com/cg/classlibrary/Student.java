package com.cg.classlibrary;

public class Student {
	int rollNo;
	String name;
	@Override
	public boolean equals(Object obj)
	{
		//this=stu1 & obj=stu2;
		boolean flag=false;
		if(obj instanceof Student)
		{
			Student stu = (Student)obj;
			if(stu.rollNo==this.rollNo && stu.name.equals(this.name))
			{
				flag=true;
			}
		}
		return flag;
		
	}
	@Override
	public void finalize()
	{
		//closing operation
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}

	@Override
	public int hashCode()
	{
		return name.length()+5;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

}
