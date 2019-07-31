package com.cg.mms.dto;

import java.time.LocalDate;

public class Mobile 
{
	private String custName;
	private String mailId;
	private String phoneNo;
	private int mobileId;
	private int purchaseId;
	private float mobilePrice;
	private LocalDate purchaseDate;
	
	
	public String getCustName() 
	{
		return custName;
	}
	
	public void setCustName(String custName) 
	{
		this.custName = custName;
	}
	
	public String getMailId() 
	{
		return mailId;
	}
	
	public void setMailId(String mailId)
	{
		this.mailId = mailId;
	}
	
	public String getPhoneNo() {
		return phoneNo;
	}
	
	public void setPhoneNo(String phoneNo) 
	{
		this.phoneNo = phoneNo;
	}
	
	public int getMobileId() 
	{
		return mobileId;
	}
	
	public void setMobileId(int mobileId) 
	{
		this.mobileId = mobileId;
	}
	
	public int getPurchaseId() 
	{
		return purchaseId;
	}
	
	public void setPurchaseId(int purchaseId) 
	{
		this.purchaseId = purchaseId;
	}
	
	public LocalDate getPurchaseDate() 
	{
		return purchaseDate;
	}
	
	public void setPurchaseDate(LocalDate purchaseDate) 
	{
		this.purchaseDate = purchaseDate;
	}
	
	public float getMobilePrice() 
	{
		return mobilePrice;
	}
	
	public void setMobilePrice(float mobilePrice) 
	{
		this.mobilePrice = mobilePrice;
	}

	public Mobile(String custName, String mailId, String phoneNo, int mobileId, int purchaseId,float mobilePrice, LocalDate purchaseDate
			) 
	{
		super();
		this.custName = custName;
		this.mailId = mailId;
		this.phoneNo = phoneNo;
		this.mobileId = mobileId;
		this.purchaseId = purchaseId;
		this.purchaseDate = purchaseDate;
		this.mobilePrice = mobilePrice;
	}

	
	
	public Mobile(String custName, String mailId, String phoneNo, int mobileId, int purchaseId, float mobilePrice) {
		super();
		this.custName = custName;
		this.mailId = mailId;
		this.phoneNo = phoneNo;
		this.mobileId = mobileId;
		this.purchaseId = purchaseId;
		this.mobilePrice = mobilePrice;
	}

	public Mobile() 
	{
		super();
		
	}

	@Override
	public String toString() 
	{
		return "Mobile [custName=" + custName + ", mailId=" + mailId + ", phoneNo=" + phoneNo + ", mobileId=" + mobileId
				+ ", purchaseId=" + purchaseId + ", purchaseDate=" + purchaseDate + ", mobilePrice=" + mobilePrice
				+ "]";
	}
	
	
	

}
