package com.cg.mms.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.cg.mms.dto.Customer;
//import com.cg.mms.util.MyStringDateUtil;
import com.cg.mms.dto.Mobile;
import com.cg.mms.exception.CustomerException;
import com.cg.mms.service.CustomerService;
import com.cg.mms.service.CustomerServiceImpl;
import com.cg.mms.util.MyStringDateUtil;


public class TestMobMgmDemo 
{
	static Scanner sc=new Scanner(System.in);
	static Customer cust=null;
	static CustomerServiceImpl csi=null;
	
	public static void main(String[] args) 
	{
      
		while(true)
		{
			 System.out.println("What do you want to do : ");
				System.out.println("1:insert new customer\n2:get the mobile by price\n3:fetch details of all the mobiles\n4:delete a mobile detail");
			
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: InsertCust();break;
			//case 2: mobRange(); break;
			//case 3: fetchDetails(); break;
			case 4: DeleteMob(); 
			        break;
			default:System.exit(1);
			}
		}


	}

	private static void MobbyPrice() 
	{
		
		
	}

	private static void DeleteMob() 
	{
	
		csi=new CustomerServiceImpl();
		System.out.println("Enter the mobid to be deleted");
		int mobId=sc.nextInt();
		csi.deleteMobile(mobId);
		
	}

	private static void FetchAllMob() 
	{
		
		
	}

	private static void InsertCust() 
	{
		
		/*try {
						
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
		}*/
		
	

		csi=new CustomerServiceImpl();
		
		System.out.println("Enter the Mobile ID");
		int mid=sc.nextInt();
		
		if(csi.checkMobileQuant(mid))
		{
		System.out.println("Enter the purchaseId number");
		int pidNum=sc.nextInt(); 
		
		System.out.println("Enter the Name of the Customer");
		String cus=sc.next();
		
		//if(csi.validateName(cus))
		//{
			System.out.println("Enter the Email");
			String email=sc.next();
			//if(csi.validateMailId(email))
			//{
				System.out.println("Enter the Phone number");
				String phNum=sc.next();
				
				//if(csi.validatePhoneNum(phNum))
				//{
					try {
					System.out.println("Enter the purchase Date indd-mm-yyyy format");
					String dt=sc.next();
					LocalDate lDate;
					lDate=MyStringDateUtil.fromStringToLocalDate(dt);
					cust=new Customer(pidNum, cus, email,phNum,lDate, mid);
					
					
						int recIns=csi.addCust(cust);
					}
					catch (CustomerException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				//else
				//	System.out.println("Invalid phone number");
			//}
			//else
				//System.out.println("Invalid email");
		//}
		//else
			//System.out.println("Invalid Name");
	//}
	 else
		System.out.println("Mobile not available");
	}
		
		
	}
		
		


