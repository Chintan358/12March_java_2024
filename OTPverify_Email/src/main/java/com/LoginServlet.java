package com;

import java.io.IOException;
import java.util.Random;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		
		if(email.equals("rishabhacejain@gmail.com") && pass.equals("test"))
		{
			Random rd = new Random();
			int otp = rd.nextInt(100,999);
			
			ServletContext cx = req.getServletContext();
			cx.setAttribute("otp", otp+"");
			
			
			EmailSending.send(email, "Login OTP", "your otp is : "+otp);
			
			req.getRequestDispatcher("otp.jsp").forward(req, resp);
		}
		else
		{
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		
		
	}

}
