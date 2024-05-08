package thread;

import java.util.Scanner;

class Account
{
	double balance;
	
	public Account(double amt)
	{
		balance = amt;
	}
	
	public boolean isExist(double amt)
	{
		boolean b = false;
		if(amt<=balance)
		{
			b = true;
		}
		return b;
	}
	
	public void withdrow(double amount)
	{
		balance = balance-amount;
		System.out.println("Cuttrt balance is : "+balance);
	}
}

class Customer extends Thread
{ 
	Account account;
	String name;
	public Customer(Account account, String name) {
		this.account = account;
		this.name = name;
	}
	
	Scanner sc = new Scanner(System.in);
	public void run()
	{
		synchronized (account) {
			
		
		
		System.out.println("Enter Amount : "+name);
		double amt = sc.nextDouble();
		if(account.isExist(amt))
		{
			account.withdrow(amt);
		}
		else
		{
			System.out.println("Insufficient amount !!!");
		}
		
		}
	}
}

public class T005_BlockSnc {
	public static void main(String[] args) {
		
		Account account = new Account(10000);
		
		Customer c1 = new Customer(account,"tops");
		Customer c2 = new Customer(account,"tech");
		
		c1.start();
		c2.start();
		
		
	}
}
