package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ser1")
public class Servlet1 extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Cookie ck[] =req.getCookies();
		
		//System.out.println(ck[0].getName()+" "+ck[0].getValue());
		
		PrintWriter  pw  =resp.getWriter();
		
		for(int i=0;i<ck.length;i++)
		{
			pw.write(ck[i].getName()+" "+ck[i].getValue());
		}
		
		
	}
	
}
