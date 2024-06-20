package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;

public class Servlet2 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw  =response.getWriter();
		pw.write("Servlet 2 Called...");
		
		ServletContext cx = request.getServletContext();
		String driver = cx.getInitParameter("driver");
		pw.write(driver);
		
		ServletConfig cf = getServletConfig();
		String path = cf.getInitParameter("path");
		pw.write(path);
	
	}

	
}
