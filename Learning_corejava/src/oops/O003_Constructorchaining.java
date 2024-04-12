package oops;

class P
{
	P()
	{
		System.out.println("Running p class constructor");
	}
}

class Q extends P
{
	Q()
	{
		super();
		System.out.println("Runing q class constructor");
	}
	
	Q(int num)
	{
		this();
		System.out.println(num);
	}
}

class R extends Q
{
	R()
	{
		
		super(10);
		System.out.println("Running r class constructor");
	}
}

public class O003_Constructorchaining {
	public static void main(String[] args) {
		
		
		R r = new R();
		
		
		
	}
}
