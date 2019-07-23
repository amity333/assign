package com.collection3;
import java.util.*;

public class MainRemoveList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		removeElements obj=new removeElements();
		
      List<String>list1=new ArrayList<String>();
      List<String>list2=new ArrayList<String>();
		
      Scanner s=new Scanner(System.in);
      String S1="",S2="";
      System.out.println("Enter size of list 1");
      int a=s.nextInt();
		System.out.println("Enter elements of list 1: ");
		for(int i=0;i<a;i++) {
		 S1=s.next();
		 list1.add(S1);
		}
		System.out.println("Enter size of list 2");
	      int b=s.nextInt();
			System.out.println("Enter elements of list 2: ");
			for(int i=0;i<b;i++) {
		     S2=s.next();
		     list2.add(S2);
			}
			System.out.println("list 1 after removal of duplicate"
					+ " elements"+obj.removeTheElements(list1,list2));
			
			s.close();
	}

}
