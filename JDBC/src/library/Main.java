package library;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int choice = 0;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice : ");
		System.out.println("0 : Exit");
		System.out.println("1 : add new book");
		System.out.println("2 : view book");
		System.out.println("3 : delete book");
		System.out.println("4 : issue book");
		choice = sc.nextInt();
		
		Oprations op  = new Oprations();
		if(choice==1)
		{
			op.addBook();
		}
		else if(choice ==2)
		{
			op.viewBook();
		}
		else if(choice==3)
		{
			op.deleteBook();
		}
		else if(choice==4)
		{
			op.issueBook();
		}
		else if(choice==0)
		{
			System.out.println("you are exited....");
		}
		else
		{
			System.out.println("Invalid choice");
		}
		
		}while(choice !=0);
		
	}
}
