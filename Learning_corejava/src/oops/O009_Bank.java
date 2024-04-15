package oops;

abstract class Account
{
	double balance;
	public abstract void deposite(double amt);
	public abstract void withdeow(double amt);
	
	public void getBalance()
	{
		System.out.println("currrent balance is : "+balance);
	}
	
}

class SavingAccount extends Account
{

	@Override
	public void deposite(double amt) {
		
		balance = balance+amt;
		
	}

	@Override
	public void withdeow(double amt) {
		
		if(amt > balance)
		{
			System.out.println("Insuffcient fund...");
		}
		else
		{
			balance = balance-amt;
		}
		
	}
	
}


public class O009_Bank {
	public static void main(String[] args) {
		
		
		SavingAccount s1 = new SavingAccount();
		s1.getBalance();
		s1.deposite(5000);
		s1.deposite(2000);
		s1.getBalance();
		
		s1.withdeow(1000);
		
		s1.getBalance();
		
	}
}
