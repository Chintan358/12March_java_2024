package exception;

import java.util.Scanner;

class Test
{
	public int display(int k)
	{
		int a = 0;
		try {
			int i = 10/k;
			return 1;
			
		} catch (Exception e) {
			e.printStackTrace();
			//System.exit(0);
			return 0;
			
		}
		finally
		{
			System.out.println("mehod complted");
		}
		
		
	}
}

public class FinallyDemo {
	public static void main(String[] args) {
		
		
		Test t = new Test();
		t.display(0);
	
		
	}
}
