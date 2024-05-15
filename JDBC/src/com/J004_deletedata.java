package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class J004_deletedata {
	public static void main(String[] args) {
		
		
		
		
		try {
			
			//load driver;
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded...");
			
			//deffine the connection url
			String url = "jdbc:mysql://localhost:3306/java_rishabh";
			String user = "root";
			String pass = "";
			
			//establish the connection
			Connection con =  DriverManager.getConnection(url,user,pass);
			System.out.println("connection esablished..");
			
			//create a satement
			Statement st = con.createStatement();
			
			//execute a query
			int i = st.executeUpdate("delete from emptabledata where empno=2363");
			
			if(i>0)
			{
				System.out.println("data deleted !!!");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
