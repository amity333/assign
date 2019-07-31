package com.cg.mms.dao;

public interface QueryMapper {

	//public static final String MOB_INSERT_QRY="INSERT into mobile(custname,mailid,phoneno,mobileid,purchaseid,mobileprice) values(?,?,?,?,?,?)";
	
	//public static final String EMP_SELECTALL="select * from employee";
	
	//public static final String EMP_DEL_QRY="delete from employee where emp_id=?";
	
	//public static final String EMP_SAL_BYSALRANGE="select * from employee where emp_sal>=? AND emp_sal<=?";
	
	//public static final String EMP_SAL_BYID="select * from employee where emp_id=?";
	
    public static final String MOB_INSERT_QRY="INSERT into purchase  values(?,?,?,?,?,?)";
	
	public static final String MOB_DEL_QRY="DELETE from MOBILES WHERE MOBILEID=?";
	
	public static final String PUR_DEL_QRY="DELETE from purchasedetails WHERE MOBILEID=?";
	
	public static final String MOB_SELECTALL="SELECT * from MOBILES";
	
	public static final String EMP_SEL_BYID="SELECT * from Emp_Parth WHERE empId=?";
	
	public static final String MOB_SEL_BYSALRANGE=  "SELECT  *  from  MOBILES WHERE  price>= ? and price<=?";
	
	public static final String CUS_UPD_MOB=  "SELECT  *  from  Mobiles WHERE MobileId = ? ";
}
