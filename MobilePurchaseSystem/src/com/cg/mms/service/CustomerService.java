package com.cg.mms.service;

import java.util.ArrayList;

import com.cg.mms.dto.Customer;
import com.cg.mms.dto.Mobile;
import com.cg.mms.exception.CustomerException;

public interface CustomerService 
{
    public int addCust(Customer cust) throws CustomerException;
	
	public void updateMobileQunt();
	
	public ArrayList<Mobile> fetchAllMob() throws CustomerException;
	
	public void deleteMobile (int mobId);
	
	public void getMobileByPrice(float max, float min);
	
	//Validation functions
	public boolean checkMobileQuant(int mobId);
	
	public boolean validateName(String name);
	
	public boolean validateMailId(String mid);
	
	public boolean validatePhoneNum(String phoneNum);
	
	public boolean validateMobileId(int MobId);
	

}
