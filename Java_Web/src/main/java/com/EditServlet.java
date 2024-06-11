package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class EditServlet  extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		int id = Integer.parseInt(req.getParameter("eid"));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_rishabh","root","");
			PreparedStatement ps = cn.prepareStatement("select * from user where id=?");
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			HashMap<String, String> map = new HashMap<String, String>();
			if(rs.next())
			{
				map.put("id", rs.getInt(1)+"");
				map.put("uname", rs.getString(2));
				map.put("email", rs.getString(3));
				map.put("pass", rs.getString(4));
			}
			
			
				
				req.setAttribute("data",map);
				RequestDispatcher rd  = req.getRequestDispatcher("update.jsp");
				rd.forward(req, resp);
				
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
