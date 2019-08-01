package com.cg.ems.util;
    
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.cg.ems.exception.EmployeeException;
    
public class DBUtil
{    
	static String unm;
	static String pwd;
	static String url;
	static String driver;
    
	public static Connection getCon() throws EmployeeException
	{
		//Connection con=null;
		try
		{
        Properties dbProps=getDBInfo(); 
		unm=dbProps.getProperty("dbUsername");
		pwd=dbProps.getProperty("dbpassword");
		url=dbProps.getProperty("dbUrl");
		driver=dbProps.getProperty("dbDriver");
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,unm,pwd);
		return con;
		}
		catch(Exception ee)
		{
			throw new EmployeeException(ee.getMessage());
		}
	}
	
	public static Properties getDBInfo() throws IOException
	{
		FileReader fr = new FileReader("dbinfo.properties");
		
		Properties myProps = new Properties();
		myProps.load(fr);
		return myProps;
	}
    
}   
