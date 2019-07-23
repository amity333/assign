public class CreatePerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Person p1=new Person("Kathy",20);
		//Account a1=new Account("Kathy",20,5678,2500);
		Account c1=new CurrentAccount();
		System.out.println("Current account="+c1);
		c1.withdraw(100);
		c1.printBalance();
		
		
		//Person p2=new Person("Smith",22);
		//Account a2=new Account("Smith",22,5697,2000);
		Account s1=new SavingsAccount();
		System.out.println("Savings account="+c1);
		s1.deposit(2000);
		s1.printBalance();
		
		
		
	}

}
