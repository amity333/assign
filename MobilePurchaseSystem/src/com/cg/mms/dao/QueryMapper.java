package com.cg.mms.dao;

public interface QueryMapper {

	public static final String MOB_INSERT_QRY="INSERT into mobile(custname,mailid,phoneno,mobileid,purchaseid,mobileprice) values(?,?,?,?,?,?)";
	
	//public static final String EMP_SELECTALL="select * from employee";
	
	//public static final String EMP_DEL_QRY="delete from employee where emp_id=?";
	
	//public static final String EMP_SAL_BYSALRANGE="select * from employee where emp_sal>=? AND emp_sal<=?";
	
	//public static final String EMP_SAL_BYID="select * from employee where emp_id=?";
}
