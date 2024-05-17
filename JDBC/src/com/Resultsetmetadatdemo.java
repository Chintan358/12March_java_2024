package com;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



import utill.DBConnection;

public class Resultsetmetadatdemo {
	public static void main(String[] args) {
		
		
		Connection cn = DBConnection.connect();
		
		Statement st;
		try {
			st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from book");
			
			
			ResultSetMetaData mdt = rs.getMetaData();
			
			System.out.println(mdt.getColumnCount());
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
		
	}
}
