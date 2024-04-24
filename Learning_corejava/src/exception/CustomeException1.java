package exception;

class ageInvalidException extends Exception
{
	
}

class Validator
{
	public void ageCheck(int age) throws ageInvalidException
	{
		if(age<18)
		{
			throw new ageInvalidException();
		}
		else
		{
			System.out.println("Valid age");
		}
	}
}

public class CustomeException1 {
	public static void main(String[] args) {
		
		Validator valid = new Validator();
		
		try {
			valid.ageCheck(17);
		} catch (ageInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
