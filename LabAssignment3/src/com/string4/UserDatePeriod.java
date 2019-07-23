package com.string4;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class UserDatePeriod {
	
	public static void duration(int d1,int m1 ,int y1,int d2,int m2 ,int y2)
	{
		LocalDate pdate = LocalDate.of(y1,m1,d1);
		LocalDate adate = LocalDate.of(y2,m2,d2);
		 
        Period diff = Period.between(pdate, adate);
        System.out.println("days="+diff.getDays());
		System.out.println("months="+diff.getMonths());
		System.out.println("years="+diff.getYears());
	}

	public static void main(String[] args) {
		

		Scanner s=new Scanner(System.in);
		System.out.println("enter day1");
		int d1=s.nextInt();
		System.out.println("enter month1");
		int m1=s.nextInt();
		System.out.println("enter year1");
		int y1=s.nextInt();
		
		System.out.println("enter day2");
		int d2=s.nextInt();
		System.out.println("enter month2");
		int m2=s.nextInt();
		System.out.println("enter year2");
		int y2=s.nextInt();
		
		duration(d1,m1,y1,d2,m2,y2);
		s.close();

	}

}
