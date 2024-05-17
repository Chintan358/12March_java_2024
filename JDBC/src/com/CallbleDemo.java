package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import utill.DBConnection;

public class CallbleDemo {
	public static void main(String[] args) {
		
		
		Connection cn =  DBConnection.connect();
		
		try {
			CallableStatement cb = cn.prepareCall("call addbook(?,?,?)");
			cb.setString(1, "java");
			cb.setDouble(2, 500);
			cb.setInt(3, 50);
			
			cb.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
