package com.cg.emp;

public interface QueryMapper {

	
	public static final String EMP_INSERT_QRY=
			"INSERT INTO emp_assign_10(emp_id,emp_name,emp_sal,emp_desig) VALUES"
			+ "(?,?,?,?)";
	
	public static final String EMP_INSERT_SAL_DESIG_QRY=
			"INSERT INTO emp_assign_10(emp_sal,emp_desig) VALUES"
			+ "(?,?)";
	

	public static final String EMP_INSERT_INSU_QRY=
			"INSERT INTO emp_insu_scheme(emp_sal,emp_desig) VALUES"
			+ "(?,?)";
	
	
	public static final String
	EMP_SELECTALL="SELECT * FROM EMP_ASSIGN_10";
	
	public static final String
	EMP_INSU_SELECTALL="SELECT * FROM emp_insu_scheme";
	
	
	public static final
	String EMP_DEL_QRY="DELETE FROM EMP_ASSIGN_10 where emp_id=? ";
	
	public static final
	String EMP_INSU_BYSALRANGE="SELECT e.emp_name,e.emp_sal,e.emp_desig,i.insu_scheme"
			+ " FROM EMP_ASSIGN_10 e,emp_insu_scheme i left join emp_insu_scheme "
			+ "on i.emp_desig between i.lowsal and i.hisal";
}
