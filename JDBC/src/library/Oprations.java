package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		
		
		try {
			
			PreparedStatement ps1 = cn.prepareStatement("select * from book where name=?");
			ps1.setString(1, name);
			
		    ResultSet rs = 	ps1.executeQuery();
			if(rs.next())
			{
				System.out.println("Book exist !!!");
			}
			else
			{
				
				System.out.println("enter price : ");
				double price = sc.nextDouble();
				System.out.println("enter qty : ");
				int qty = sc.nextInt();
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
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void viewBook()
	{
		System.out.println("****View book****");
		try {
			PreparedStatement ps = cn.prepareStatement("select * from book");
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDouble(3)+" "+rs.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void issueBook()
	{
		System.out.println("****Issue book****");
		System.out.println("enter book name : ");
		String name = sc.next();
		
		try {
			PreparedStatement ps = cn.prepareStatement("select * from book where name=?");
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				int qty = rs.getInt(4);
				if(qty<1)
				{
					System.out.println("Book not avalable at the moment !!!");
				}
				else
				{
					
					qty--;
					PreparedStatement ps1 = cn.prepareStatement("update book set qty=? where name=?");
					ps1.setInt(1, qty);
					ps1.setString(2, name);
					
					int i = ps1.executeUpdate();
					if(i>0)
					{
						System.out.println("Book issued !!!!");
					}
					
					
					
				}
				
			}
			else
			{
				System.out.println("Book not exists !!!!");
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public void deleteBook()
	{
		System.out.println("****Delete book****");
		System.out.println("enter book name : ");
		String name = sc.next();
		try {
			PreparedStatement ps = cn.prepareStatement("delete from book where name=?");
			ps.setString(1, name);
			int i = ps.executeUpdate();
			if(i>0)
			{
				System.out.println("book deleted...");
			}
			else
			{
				System.out.println("book not found !!");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
