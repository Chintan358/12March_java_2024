package exception;

import java.sql.Blob;

class InsufficientAmountException extends Exception
{
	double amt;
	
	public InsufficientAmountException(double need) {
		amt = need;
	}
	
	public void message()
	{
		System.out.println("Your have to need more "+amt+" in your account");
	}
}

class Bank
{
	double balance;
	
	public void checkBalance()
	{
		System.out.println("current balanc eis : "+balance);
	}
	
	public void deposite(double amt)
	{
		balance = balance+amt;
	}
	
	public void withdrow(double amt) throws InsufficientAmountException
	{
		if(amt>balance)
		{
			double need = amt-balance;
			throw new InsufficientAmountException(need);
		}
		else
		{
			balance = balance-amt;
		}
	}
}



public class CustomeException {
	public static void main(String[] args) {
		
		
		Bank b = new Bank();
		b.checkBalance();
		b.deposite(5000);
		b.checkBalance();
		
		try {
			b.withdrow(19000);
		} catch (InsufficientAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.message();
		}
		
		b.checkBalance();
	}
}
