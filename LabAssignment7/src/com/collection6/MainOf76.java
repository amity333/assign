package com.collection6;
import java.util.Collections;

public class MainOf76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Collections.sort(list1, new SortObject());
		System.out.println("after sorting=");
		for(Employee stu1:list1)
			System.out.println(stu1);
		
	}

}
