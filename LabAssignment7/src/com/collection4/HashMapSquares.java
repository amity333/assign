package com.collection4;
import java.util.*;
public class HashMapSquares {

	
	public HashMap<Integer, Integer> getSquares(int a[]){
		
		HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
		for(int i=0;i<a.length;i++)
		{
			map.put(a[i], a[i]*a[i]);
		}
		
		return map;
	}
}
