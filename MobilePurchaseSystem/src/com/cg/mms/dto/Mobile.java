package com.cg.mms.dto;

public class Mobile 
{
	int mobId;
	String name;
	float price;
	int quant;
	
	public Mobile() 
	{
		super();
		
	}
	
	
	public Mobile(int mobId, String name, float price, int quant)
	{
		super();
		this.mobId = mobId;
		this.name = name;
		this.price = price;
		this.quant = quant;
	}
	
	
	@Override
	public String toString()
	{
		return "Mobile [mobId=" + mobId + ", name=" + name + ", price=" + price + ", quant=" + quant + "]";
	}
	
	public int getMobId() 
	{
		return mobId;
	}
	
	public void setMobId(int mobId) 
	{
		this.mobId = mobId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public float getPrice() 
	{
		return price;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}
	
	public int getQuant()
	{
		return quant;
	}
	
	public void setQuant(int quant)
	{
		this.quant = quant;
	}

	
}
