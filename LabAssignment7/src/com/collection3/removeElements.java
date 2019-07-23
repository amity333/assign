package com.collection3;
import java.util.*;
public class removeElements {

	public List<String> removeTheElements(List<String>list1,List<String>list2)
	{
		
		list1.removeAll(list2);
		return list1;
	}
	
}
