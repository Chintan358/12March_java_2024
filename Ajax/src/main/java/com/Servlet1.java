package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.CopyOnWriteArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ser1")
public class Servlet1 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		String value = req.getParameter("value");
		
		PrintWriter pw = resp.getWriter();
		
//		if(value.equals("electric"))
//		{
//			pw.append("<ul><li>Fan</li><li>TV</li><li>Laptop</li></ul>");
//		}
//		else if(value.equals("cloths"))
//		{
//			pw.append("<ul><li>Cap</li><li>Shirt</li><li>T-shirt</li></ul>");
//		}
//		else
//		{
//			pw.append("No found");
//		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn   =DriverManager.getConnection("jdbc:mysql://localhost:3306/java_rishabh","root","");
		
			Statement st  =cn.createStatement();
			ResultSet rs = st.executeQuery("select * from product where pname like '"+value+"%' ");
			String str = "<ul>";
			while(rs.next())
			{
				str=str+"<li>"+rs.getString("pname")+"</li>";
				
				
			}
			str=str+"</ul>";
			
			
		
			
			pw.append(str);
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
