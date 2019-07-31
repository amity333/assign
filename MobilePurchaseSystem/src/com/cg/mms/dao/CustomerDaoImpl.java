package com.cg.mms.dao;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.mms.dto.Customer;
import com.cg.mms.dto.Mobile;
import com.cg.mms.exception.CustomerException;
import com.cg.mms.util.DBUtil;
import com.cg.mms.util.MyStringDateUtil;

public class CustomerDaoImpl implements CustomerDao 
{
	Connection con=null;
	Statement st=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	
	@Override
	public int addCust(Customer cust) throws CustomerException
	{
       // java.sql.Date sqlDOB=MyStringDateUtil.fromLocalToSqlDate(emp.getEmpDOB());
		
        CustomerDaoImpl mdi=new CustomerDaoImpl();
		
		int mobId=cust.getMobileId();
		
		//System.out.println("con = ");
		int recIns=0;
		try {
			con=DBUtil.getCon();
			 
			//pst=con.prepareStatement(QueryMapper.MOB_INSERT_QRY);
			PreparedStatement pst = con.prepareStatement("select * from mobile where mobileid=?");
			
		    /*pst.setString(1, mob.getCustName());
		    pst.setString(2, mob.getMailId());
		    pst.setString(3, mob.getPhoneNo());
		    pst.setInt(4, mob.getMobileId());
		    pst.setInt(5, mob.getPurchaseId());
			pst.setFloat(6, mob.getMobilePrice());
			
			//pst.setDate(4,sqlDOB);
			dataInserted=pst.executeUpdate();*/
			
			pst.setInt(1, mobId);
			int o=pst.executeUpdate();
			ResultSet rsq=pst.executeQuery();
			boolean b=rsq.next();
			
			int quant=rsq.getInt(4);
			PreparedStatement psto=con.prepareStatement("update Mobiles set quantity=? Where Mobileid=?");
			psto.setInt(2, mobId);
			psto.setInt(1, quant-1);
			
			o=psto.executeUpdate();
			System.out.println(quant);
			
			
			if(pst!=null && mdi.checkMobileQuant(mobId))
			{
				
				pst=con.prepareStatement(QueryMapper.MOB_INSERT_QRY);
				
				pst.setInt(1, cust.getPurchaseId());
				pst.setString(2, cust.getCname());
				pst.setString(3, cust.getMailId());
				pst.setString(4,cust.getPhoneNo());
				pst.setDate(5,MyStringDateUtil.fromLocalToSqlDate(cust.getLd()));
				pst.setInt(6, cust.getMobileId());
				
				
				//pstq.setInt(4, quant-1);
				System.out.println("Table updated");
				recIns=pst.executeUpdate();
			}
			else
			{
				System.out.println("Mobile not found");
			}
			
		} 
		catch (ClassNotFoundException | IOException | SQLException e) 
		{	
			e.printStackTrace();
		}
		
		return recIns;
	}
	
	
	

	@Override
	public void updateMobileQunt()
	{
		
		
	}

	@Override
	public boolean checkMobileQuant(int mobileId) 
	{
		
		return false;
	}

	public boolean validateMobileId(int MobId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Mobile> fetchAllMob() throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMobile(int mobId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getMobileByPrice(int max, int min) {
		// TODO Auto-generated method stub
		
	}
	

}
