package exception;

class Demo
{
	public void test() throws ClassNotFoundException
	{
			Class.forName("oops.Access");
	}
}

public class E002_CompileTimeExceptionDemo {
	public static void main(String[] args) throws ClassNotFoundException{
		
		
		Demo d = new Demo();
		
		d.test();
		
	
		
		
		
	}
}
