package com.cg.emp;

import java.sql.*;
import java.util.Scanner;


public class InsuSchemeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con=null;
		Statement st=null;ResultSet rs=null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@10.51.103.201:1521:ORCL11G",
				"LAB2ETRG8","lab2eoracle");
		
		st=con.createStatement();
		rs=st.executeQuery("SELECT e.emp_name,e.emp_sal,e.emp_desig,i.insu_scheme"
			+ " FROM EMP_ASSIGN_10 e,emp_insu_scheme i where e.emp_sal>i.lowsal and e.emp_sal"
			+ "<=i.hisal");
		System.out.println("emp name\t\t"+"emp sal\t\t"+"emp desig\t\t"+"insu scheme");
		while(rs.next()) {
			System.out.println(rs.getString("emp_name")+"\t\t"+
                    rs.getFloat("emp_sal")+"\t\t"+rs.getString("emp_desig")+
                    "\t\t"+rs.getString("insu_scheme"));
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
