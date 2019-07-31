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
		return 0;
	}

	public void updateMobileQunt() {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Mobile> fetchAllMob() throws CustomerException {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteMobile(int mobId) {
		// TODO Auto-generated method stub
		
	}

	public void getMobileByPrice(int max, int min) {
		// TODO Auto-generated method stub
		
	}

	public boolean checkMobileQuant(int mobId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean validateMailId(String mid) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean validatePhoneNum(String phoneNum) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean validateMobileId(int MobId) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
