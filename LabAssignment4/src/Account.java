

public abstract class Account extends Person {

	long accNum;
	double balance;
	Person accHolder;
	
	
	public Account()
	{
		super();
		accNum=0;balance=0;accHolder=null;
	}
	

	public Account(String name,int age,long accNum, double balance) {
		super(name,age);
		this.accNum = accNum;
		this.balance = balance;
		
		
	}




	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void deposit(double a)
	{
		balance=balance+a;
		
	}
	
	public abstract void withdraw(double a);

	
	public double getBalance(double a)
	{
		return balance;
	}
	public void printBalance()
	{
		System.out.println("Updated balance of"+name+"is"+balance);
	}

	@Override
	public String toString() {
		return super.toString()+"Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	
	
}
