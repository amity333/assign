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
	PreparedStatement pst,pst1=null;
	ResultSet rs=null;
	
	@Override
	public int addCust(Customer cust) throws CustomerException
	{
       // java.sql.Date sqlDOB=MyStringDateUtil.fromLocalToSqlDate(emp.getEmpDOB());
		
        CustomerDaoImpl cdi=new CustomerDaoImpl();
		
		int mobId=cust.getMobileId();
		
		//System.out.println("con = ");
		int recIns=0;
		try {
			con=DBUtil.getCon();
			//System.out.println("con = ");
			 
			//pst=con.prepareStatement(QueryMapper.MOB_INSERT_QRY);
			PreparedStatement pstq = con.prepareStatement("select * from mobile where mobileid=?");
			
		    /*pst.setString(1, mob.getCustName());
		    pst.setString(2, mob.getMailId());
		    pst.setString(3, mob.getPhoneNo());
		    pst.setInt(4, mob.getMobileId());
		    pst.setInt(5, mob.getPurchaseId());
			pst.setFloat(6, mob.getMobilePrice());
			
			//pst.setDate(4,sqlDOB);
			dataInserted=pst.executeUpdate();*/
			
			pstq.setInt(1, mobId);
			int o=pstq.executeUpdate();
			ResultSet rsq=pstq.executeQuery();
			boolean b=rsq.next();
			
			int quant=rsq.getInt(4);
			PreparedStatement psto=con.prepareStatement("update mobile set mobilequantity=? Where mobileid=?");
			psto.setInt(2, mobId);
			psto.setInt(1, quant-1);
			
			o=psto.executeUpdate();
			System.out.println(quant);
			
			
			if(pst!=null && cdi.checkMobileQuant(mobId))
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
		try 
		{
			con=DBUtil.getCon();
			pst=con.prepareStatement("select * from Mobile where mobileid=?");
			pst.setInt(1,mobileId);
			
			rs=pst.executeQuery();
			boolean b=rs.next();
			if(rs.getInt(4)>0)
				return true;
			
			else 
				return false;
		} 
		catch (ClassNotFoundException | CustomerException | IOException
				| SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean validateMobileId(int MobId) {
		// TODO Auto-generated method stub
		boolean f=false;
		try 
		{
			con=DBUtil.getCon();
			
			pst=con.prepareStatement("select * from Mobile where mobileid=?");
			pst.setInt(1, MobId);
			
			rs=pst.executeQuery();
			
			
			ArrayList<Integer> ar=new ArrayList<Integer>();
			if(rs!=null)
			while(rs.next())
			{
				ar.add(rs.getInt(1));
			}
			//&& ar.get(i)==MobId
			String mobileId=Integer.toString(MobId);
			for(Integer i:ar)
			{
				if(mobileId.matches("\\d{4}") )
				{
					f= true;
				}
				else
					f=false;
				} 
			}
		catch (ClassNotFoundException | CustomerException | IOException| SQLException e) 
		{
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
		
		
	}

	@Override
	public ArrayList<Mobile> fetchAllMob() throws CustomerException
	{
		ArrayList<Mobile> arr=new ArrayList<Mobile>();
		try {
			con=DBUtil.getCon();
			pst=con.prepareStatement(QueryMapper.MOB_SELECTALL);
			rs=pst.executeQuery();
			while(rs.next())
			{
				arr.add(new Mobile(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));
			}
		} 
		catch (ClassNotFoundException | IOException | SQLException e) 
		{
			e.printStackTrace();
		}
	
		return arr;


	}

	@Override
	public void deleteMobile(int mobId) 
	{

		try
		{
				con=DBUtil.getCon();
				pst1=con.prepareStatement(QueryMapper.PUR_DEL_QRY);
				pst1.setInt(1,mobId);
				pst1.executeQuery();
				pst=con.prepareStatement(QueryMapper.MOB_DEL_QRY);
				pst.setInt(1,mobId);
				pst.executeQuery();
		} 
		catch (ClassNotFoundException | CustomerException | IOException| SQLException e) 
		{
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void getMobileByPrice(float max, float min) 
	{
	
		try
		{
			con=DBUtil.getCon();
			pst=con.prepareStatement(QueryMapper.MOB_SEL_BYSALRANGE);
			pst.setFloat(1, min);
			pst.setFloat(2,max);
			rs=pst.executeQuery();
			while(rs.next())	
			{
				System.out.println(rs.getString("modelname"));
			}
		}
		catch (ClassNotFoundException | CustomerException | IOException| SQLException e)
		{
			
			e.printStackTrace();
		}
		
	}
	

}
