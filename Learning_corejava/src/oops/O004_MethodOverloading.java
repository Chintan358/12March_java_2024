package oops;


class Calc
{
	public void add(int a, int b)
	{
		int r = a+b;
		System.out.println("m1 : "+r);
	}
	
	public void add(int a, int b, int c)
	{
		int r = a+b+c;
		System.out.println("m2 : "+r);
	}
	

	public void add(int a, double b)
	{
		double r = a+b;
		System.out.println("m3 : "+r);
	}
}

public class O004_MethodOverloading {
	
	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.add(10, 20);
		c.add(20, 30, 60);
		c.add(20, 30.36);
	}
	
	
}
