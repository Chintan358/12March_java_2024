package oops;

class A
{
	int id = 10;
	
	public void display()
	{
		System.out.println("Runing A class display");
	}
}

class B extends A
{
	int id = 50;
	public void show()
	{
		int id = 100;
		System.out.println(id);
		System.out.println(this.id);
		System.out.println(super.id);
		System.out.println("Runinng B class show");
	}
}

class C extends A
{
	
}


public class O002_InheritanceDemo {
	public static void main(String[] args) {
		
		
//		B b  = new B();
//		b.show();
//		b.display();
		
		//upcationg
//		A a = new B();
		
		//down castiong
		
		
//		System.out.println(new B() instanceof A);
//		System.out.println(new A() instanceof B);
		
		if(new A() instanceof B)
		{
			B b =  (B) new A();
		}
	}
}
