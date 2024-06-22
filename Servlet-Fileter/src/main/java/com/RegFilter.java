package com;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/reg")
public class RegFilter extends HttpFilter {
	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String cpass = request.getParameter("cpass");
		
		
		RequestDispatcher rd =  request.getRequestDispatcher("home.jsp");
		
		if(uname=="" || uname==null)
		{
			request.setAttribute("unameErr", "Username is required !!!!");
			rd.forward(request, response);
		}
		
		if(email=="" || email==null)
		{
			request.setAttribute("emailErr", "Email is required !!!!");
			rd.forward(request, response);
		}else if(!Validation.emailValidation(email))
		{
			request.setAttribute("emailErr", "Invalid email Formate");
			rd.forward(request, response);
		}
		
		
		if(pass=="" || pass==null)
		{
			request.setAttribute("passErr", "Password is required !!!!");
			rd.forward(request, response);
		}
		
		if(!pass.equals(cpass))
		{
			request.setAttribute("cpassErr", "Password and cpass must be same !!!!");
			rd.forward(request, response);
		}
		
		chain.doFilter(request, response);
		
	}
}
