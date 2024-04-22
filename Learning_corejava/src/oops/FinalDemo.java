package oops;

/*final*/ class Sample1
{
	/* final */ public void display()
	{
		
	}
}
class Demo1 extends Sample1
{
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	}
}

public class FinalDemo {
	public static void main(String[] args) {
		final int a = 10;
		//a = 20;
		
		System.out.println(a);
	}
}
