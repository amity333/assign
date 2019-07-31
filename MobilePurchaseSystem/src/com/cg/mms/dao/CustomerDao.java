package com.cg.mms.dao;

import java.util.ArrayList;

import com.cg.mms.dto.Customer;
import com.cg.mms.dto.Mobile;
import com.cg.mms.exception.CustomerException;

public interface CustomerDao 
{
    public int addCust(Customer cust) throws CustomerException;
		
	public ArrayList<Mobile> getAllMob();
	
	public int deleteMob(int mobileId) ;
	public int getMobByPrice(int max,int min);
	
    //public int addCust(Customer cust) throws CustomerException;
	
	public void updateMobileQunt();
	
	//public ArrayList<Mobile> fetchAllMob() throws CustomerException;
	
	//public void deleteMobile (int mobId);
	
	//public void getMobileByPrice(int max, int min);
	
	public boolean checkMobileQuant(int mobileId);
	
	//public boolean validateMobileId(int MobId);
	

}
