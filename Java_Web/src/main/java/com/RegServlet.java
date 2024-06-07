package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

@WebServlet("/reg")
public class RegServlet  extends HttpServlet{
	

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname =  req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		
		  PrintWriter pw =resp.getWriter(); 
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_rishabh","root","");
			PreparedStatement ps = cn.prepareStatement("insert into user(uname,email,pass) values(?,?,?)");
			ps.setString(1, uname);
			ps.setString(2, email);
			ps.setString(3, pass);
			
			int i  = ps.executeUpdate();
			
			if(i>0)
			{
				//pw.write("<h1>Registration success !!!!!</h1>");
				
				req.setAttribute("msg", "registration success !!!!");
				RequestDispatcher rd  = req.getRequestDispatcher("home.jsp");
				rd.forward(req, resp);
				//rd.include(req, resp);
				//resp.sendRedirect("home.html");
			}
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
