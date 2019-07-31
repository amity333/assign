package com.cg.mms.ui;

import java.util.Scanner;

//import com.cg.mms.util.MyStringDateUtil;
import com.cg.mms.dto.Mobile;
import com.cg.mms.exception.MobileException;
import com.cg.mms.service.MobileService;
import com.cg.mms.service.MobileServiceImpl;

public class TestMobMgmDemo 
{
   static Scanner sc = new Scanner(System.in);
	
	static MobileService mobService=null;
	
	public static void main(String[] args) 
	{
		mobService=new MobileServiceImpl();
		
		
		int choice; 
		
	    while(true)
	    {
	    	System.out.println("what do u want to do ?");
		    System.out.println("1.addCus\n2.Fetch all Mob\n3.delete mob \n4.get mob by price\n5.exit");
		    
		    choice=sc.nextInt();
		    
		    switch(choice)
		    {
		        
		    case 1:InsertCust();
		           break;
		    //default:System.exit(1);
		    case 2:FetchAllMob();
		           break;
		    case 3:DeleteMob();
		           break;
		    case 4:MobbyPrice();
		           break;
		    }
	    }

	}

	private static void MobbyPrice() 
	{
		
		
	}

	private static void DeleteMob() 
	{
	
		
	}

	private static void FetchAllMob() 
	{
		
		
	}

	private static void InsertCust() 
	{
		
		try {
						
				System.out.println("enter customer Name: ");
				String cusname=sc.next();
				
				if(mobService.validateName(cusname))
				{
					System.out.println("enter customer mailid: ");
					String mailid=sc.next();
					
					System.out.println("enter customer phoneNo: ");
					String phone=sc.next();
					
					System.out.println("enter mobile id: ");
					int mobid=sc.nextInt();
					
					System.out.println("enter purchase id: ");
					int purchaseid=sc.nextInt();
					
					System.out.println("enter mobile price: ");
					float mobprice=sc.nextFloat();
					
					//System.out.println("enter purchase date in dd-mm-yyyy: ");
					//String strDate=sc.next();
					
					Mobile ee = new Mobile(cusname,mailid,phone,mobid,purchaseid,mobprice);
					
					//ee.setPurchaseDate(MyStringDateUtil.fromStringToLocalDate(strDate));
					
					int dataAdd=mobService.addCust(ee);
				
					if(dataAdd==1)
					{
						System.out.println("data inserted");
					}
					else
					{
						System.out.println("some error in insert");
					}
				}
				
			
		}
		
		catch (MobileException e)
		{
			System.out.println(e.getMessage());
		}
		
	
		
	}

}
