package com.collection2;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class OperationStringObject {

	
	public ArrayList<String> Operations(String S1,String S2){
		
		ArrayList<String>list=new ArrayList<String>();
		String S3=S1,S4="";int k=0;

		//FIRST OPERATION
		for(k=1;k<S3.length();k+=2)
		{
			
			S3.replace(S3.substring(k,k+1),S2);
		}
		list.add(S3);
		
		//SECOND OPERATION
		int j = 0;
		Pattern p = Pattern.compile(S2);
		Matcher m = p.matcher(S1);
		while (m.find()) {
		    j++;
		}
		if(j>1) {
			
		int start = S1.lastIndexOf(S2);
		StringBuilder builder = new StringBuilder();
		builder.append(S1.substring(0, start));
		for(int i=S2.length()-1;i>=0;i--)
		{
			S4=S4+S2.charAt(i);
		}
		builder.append(S4);
		builder.append(S1.substring(start + S4.length()));
		String S5=builder.toString();//converting StringBuilder to String  
		list.add(S5);
		}
		else
			list.add(S1.concat(S2));
		
		//THIRD OPERATION
		int j1 = 0;
		Pattern p1 = Pattern.compile(S2);
		Matcher m1 = p1.matcher(S1);
		while (m1.find()) {
		    j1++;
		}
		if(j1>1) 
		{
			 String S6=S1.replace(S2,S1);
			 list.add(S6);
		}
		else
			list.add(S1);                                                                      
		
		//FOURTH OPERATION
		String S7="",S8="",S9="",S10="";
		S7=S2.substring(0,S2.length()/2);
		S8=S2.substring(S2.length()/2);
		S9=S7.concat(S1);S10=S9.concat(S8);
		list.add(S10);
		
		//FIFTH OPERATION
		String S11="";
		for(int i=0;i<S1.length()-2;i++) {
			if(S1.substring(i, i+S2.length()).equals(S2)) {
				S11=S1.replace(S1.substring(i, i+S2.length()),"*");
			}
		}
		list.add(S11);
		
		
		

		return list;
	}
}
