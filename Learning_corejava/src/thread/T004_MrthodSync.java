package thread;

class Calc
{
	synchronized public void table(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+n*i);
		}
	}
}

class MyThread extends Thread
{
	Calc c = new Calc();
	public void run()
	{
		c.table(5);
	}
}

public class T004_MrthodSync {
	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		
		Thread th1  = new Thread(t1);
		Thread th2  = new Thread(t1);
		Thread th3 = new Thread(t1);
		
		th1.start();
		th2.start();
		th3.start();

		
	}
}
