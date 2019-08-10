package com.cg.emp;

import java.sql.*;
import java.util.*;


public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner s=new Scanner(System.in);
		System.out.println("enter ID: ");
		int eid=s.nextInt();
		System.out.println("enter name: ");
		String enm=s.next();
		System.out.println("enter salary: ");
		float esal=s.nextFloat();
		System.out.println("enter designation: ");
		String desig=s.next();
		
		Connection con=null;
		Statement st=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@10.51.103.201:1521:ORCL11G",
				"LAB2ETRG8","lab2eoracle");
		
		pst=con.prepareStatement(QueryMapper.EMP_INSERT_QRY);
		pst.setInt(1, eid);
		pst.setString(2, enm);
		pst.setFloat(3, esal);
		pst.setString(4, desig);
		int recInserted= pst.executeUpdate();
		st=con.createStatement();
		rs=st.executeQuery("select * from emp_assign_10");
		System.out.println("EMPID\t\t"+"EMPNAME\t\t"+"EMPSAL\t\t");
		while(rs.next())
		{
			System.out.println(rs.getInt("emp_id")+"\t\t"+
		                                     rs.getString("emp_name")+"\t\t"+
					                         rs.getFloat("emp_sal")+"\t\t"+rs.getString("emp_desig"));
		}
		System.out.println(recInserted+" Record inserted in the table");
	}
		catch(Exception e)
		{
			
			e.printStackTrace();
		}
	}

}
