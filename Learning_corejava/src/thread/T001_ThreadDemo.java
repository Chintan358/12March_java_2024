package thread;

class Th1 extends Thread

{
	public void run()
	{
		for(int i = 1;i<=100;i++)
		{
			System.out.println("Th1 : "+i);
		}
	}
}

class Th2 extends Thread
{
	public void run()
	{
		for(int i = 1;i<=100;i++)
		{
			System.out.println("Th2 : "+i);
		}
	}
}
public class T001_ThreadDemo {
	public static void main(String[] args) {
		
		Th1 t1 = new Th1();
		Th2 t2 = new Th2();
		
		
		t1.start();
		t2.start();
		
	}
}
