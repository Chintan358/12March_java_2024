package oops;

class X
{
	public  void display(int a)
	{
		System.out.println("runing display of x");
	}
	
	public  void display()
	{
		System.out.println("runing display of x");
	}
	
	
	
}

class Y extends X
{
	@Override
	public void display() {
		System.out.println("Runing display of y");
		//super.display();
	}
	
	@Override
	public void display(int a) {
		// TODO Auto-generated method stub
		super.display(a);
	}
}

public class O005_Overriding {
	public static void main(String[] args) {
		
		Y y = new Y();
		y.display();
		
	}
}
