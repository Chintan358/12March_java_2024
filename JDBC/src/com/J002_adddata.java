package com;

import java.sql.*;


public class J002_adddata {
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
			int i = st.executeUpdate("insert into emptabledata(empno,ename,job)values(2363,'rishabh','developer')");
			
			if(i>0)
			{
				System.out.println("data inserted !!!");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
