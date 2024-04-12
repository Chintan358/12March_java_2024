package statements;

import java.util.Scanner;

public class S001_If_Demo {
	public static void main(String[] args) {
		
		int age = 0;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age : ");
		age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Elegeble for voting...");
		}
		else
		{
			System.out.println("Not elegeble");
		}
		}while(age>0);
		
	}
}
