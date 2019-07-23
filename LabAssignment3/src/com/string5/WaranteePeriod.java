package com.string5;
import java.time.*;
import java.util.Scanner;

public class WaranteePeriod {

	public static void duration(int d1,int m1 ,int y1,int m2,int y2)
	{
		LocalDate pdate = LocalDate.of(y1,m1,d1);
		LocalDate wperiod = pdate.plusMonths(m2+12*y2) ;
		 
        
        System.out.println("warranty date is:"+wperiod);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("enter pday");
		int d1=s.nextInt();
		System.out.println("enter pmonth");
		int m1=s.nextInt();
		System.out.println("enter pyear");
		int y1=s.nextInt();
		System.out.println("enter wmths");
		int m2=s.nextInt();
		System.out.println("enter wyear");
		int y2=s.nextInt();
		duration(d1,m1,y1,m2,y2);
		s.close();
		
	}

}
