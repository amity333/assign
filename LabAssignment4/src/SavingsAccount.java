public class SavingsAccount extends Account{
	
	final double minBalance=1000;
	
	public SavingsAccount()
	{
		System.out.println("Object of SavingsAccount class");
	}
	
	public void withdraw(double a)
	{
		if(balance<minBalance)
		{
			System.out.println("Minimum balance should be: "+minBalance);
		}
		else
		{
			balance=balance-a;
		}
	}
	public void printBalance()
	{
		System.out.println("Updated balance of"+name+"is"+balance);
	}

}
