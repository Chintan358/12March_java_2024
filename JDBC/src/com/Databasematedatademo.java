package com;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import utill.DBConnection;

public class Databasematedatademo {
	public static void main(String[] args) {
		
		
		Connection cn = DBConnection.connect();
		
		try {
			DatabaseMetaData db = cn.getMetaData();
			
			System.out.println(db.getDriverName());
			System.out.println(db.getDatabaseMajorVersion());
			System.out.println(db.getDatabaseProductVersion());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
