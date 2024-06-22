package com;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/secret1")
public class IndexFilter extends HttpFilter{

	String status =null;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		ServletContext cx =filterConfig.getServletContext();
		 status = cx.getInitParameter("underconstruction");
	}
	
	@Override
	protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		if(status.equals("yes"))
		{
			request.getRequestDispatcher("working.jsp").forward(request, response);
		}
		
		chain.doFilter(request, response);
		
		
	}
}
