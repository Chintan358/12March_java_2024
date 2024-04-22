package exception;

class Rec
{
	public void square(int i)
	{
		System.out.println(i*i);
		i++;
		if(i<20)
		{
		square(i);
		}
	}
}

public class RecursionDemo {
	public static void main(String[] args) {
		
		Rec c = new Rec();
		c.square(10);
		
	}
}
