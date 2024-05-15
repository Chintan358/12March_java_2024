package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class J001_dbconnection {
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
			ResultSet rs =  st.executeQuery("select * from emptabledata");
			
			//process the resultset
			while(rs.next())
			{
				int empno = rs.getInt(1);
				String ename = rs.getString(2);
				String job = rs.getString(3);
				
				System.out.println(empno+" "+ename+" "+job);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
