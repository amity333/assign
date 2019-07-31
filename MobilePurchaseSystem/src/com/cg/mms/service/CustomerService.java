package com.cg.mms.service;

import java.util.ArrayList;

import com.cg.mms.dto.Mobile;
import com.cg.mms.exception.CustomerException;

public interface CustomerService 
{
	public int addCust(Mobile mob) throws CustomerException;
	
	public ArrayList<Mobile> getAllMob();
	
	public int deleteMob(int mobileId) ;
	public int getMobByPrice(int mobilePrice);
	
	public boolean validateName(String custName) throws CustomerException;

}
