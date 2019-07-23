package com.string8;
import java.util.Scanner;

public class SortingStringObjects {

	
	public static void sorting(String a[])
	{
		for(int i=0;i<a.length-1;i++){
	        for(int j=i+1;j<a.length;j++){
	            if(a[i].compareTo(a[j]) >=0){
	                String temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
	        }

	    }
		if(a.length%2==1)
		{
		 for(int j=0;j<a.length/2+1;j++){
			 System.out.println(a[j].toUpperCase());
		    }
		 for(int j=a.length/2+1;j<a.length;j++){
			 System.out.println(a[j].toLowerCase());
		    }
		}
		else
		{
			for(int j=0;j<a.length/2;j++){
				 System.out.println(a[j].toUpperCase());
			    }
			 for(int j=a.length/2;j<a.length;j++){
				 System.out.println(a[j].toLowerCase());
			    }
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		 System.out.println("enter the length of String array");
		    int n=sc.nextInt();
		    String[] sarray=new String[n];

		    for(int i=0;i<n;i++){
		        System.out.println("enter"+" String :"+(i+1));
		        sarray[i]=sc.nextLine();
		    }
		        sorting(sarray);
		        sc.close();
	}

}
