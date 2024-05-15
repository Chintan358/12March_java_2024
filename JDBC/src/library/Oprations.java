package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Oprations {
	
	Connection cn = null;
	public Oprations() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_rishabh","root","");;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	Scanner sc = new Scanner(System.in);
	public void addBook()
	{
		System.out.println("****Add book****");
		System.out.println("enter book name : ");
		String name = sc.next();
		System.out.println("enter price : ");
		double price = sc.nextDouble();
		System.out.println("enter qty : ");
		int qty = sc.nextInt();
		
		try {
			PreparedStatement ps = cn.prepareStatement("insert into book values(?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, name);
			ps.setDouble(3, price);
			ps.setInt(4, qty);
			
			int i = ps.executeUpdate();
			
			if(i>0)
			{
				System.out.println("Book added...");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void viewBook()
	{
		System.out.println("****View book****");
	}
	
	public void issueBook()
	{
		System.out.println("****Issue book****");
	}
	
	public void deleteBook()
	{
		System.out.println("****Delete book****");
	}
}
