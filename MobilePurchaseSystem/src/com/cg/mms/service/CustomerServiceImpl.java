package com.cg.mms.service;


import java.util.ArrayList;
import java.util.regex.Pattern;
import com.cg.mms.dao.CustomerDao;
import com.cg.mms.dao.CustomerDaoImpl;
import com.cg.mms.dto.Customer;
import com.cg.mms.dto.Mobile;
import com.cg.mms.exception.CustomerException;


public class CustomerServiceImpl implements CustomerService
{

     CustomerDaoImpl cdi=new CustomerDaoImpl();
	
	public int addCust(Customer cust) throws CustomerException {
		// TODO Auto-generated method stub
		return cdi.addCust(cust);
	}

	public void updateMobileQunt() {
		// TODO Auto-generated method stub
		cdi.updateMobileQunt();
	}

	public ArrayList<Mobile> fetchAllMob() throws CustomerException {
		// TODO Auto-generated method stub
		return cdi.getAllMob();
	}

	public void deleteMobile(int mobId) {
		// TODO Auto-generated method stub
		cdi.deleteMob(mobId);
	}

	public void getMobileByPrice(int max, int min) {
		// TODO Auto-generated method stub
		cdi.getMobByPrice(max, min);
	}
//---------------------------------//
	@Override
	public boolean validateName(String name) 
	{
		// TODO Auto-generated method stub
		if(name.matches("[A-Z][a-z]{1,19}"))
		{
			return true;
		}
		else
			return false;
	}

	public boolean validateMailId(String mid)
	{
		if(mid.matches("^(.+)@(.+)$"))
			return true;
		else
			return false;
	}

	public boolean validatePhoneNum(String phoneNum) 
	{
		// TODO Auto-generated method stub
		if(phoneNum.matches("[7-9][0-9]{9}"))
			return true;
		else
			return false;
	}

	public boolean validateMobileId(int mobId) 
	{
		return cdi.validateMobileId(mobId);
	}

	public boolean checkMobileQuant(int mobId) {
		// TODO Auto-generated method stub
		return cdi.checkMobileQuant(mobId);
	}
	
}
