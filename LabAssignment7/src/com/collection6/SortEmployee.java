package com.collection6;
import java.util.Comparator;

public class SortEmployee implements Comparator<Object> {

	
	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		int diff=0;
		if(arg0 instanceof Employee && arg1 instanceof Employee)
		{
			Employee emp1=(Employee)arg0;
			Employee emp2=(Employee)arg1;
			diff=(int)(emp1.getEmpSal()-emp2.getEmpSal());
		}
		
	    return diff;

	
}
}
