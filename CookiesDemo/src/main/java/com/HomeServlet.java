package com;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
 @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	Cookie ck = new Cookie("user", "Rishabh");
	ck.setMaxAge(30);
	resp.addCookie(ck);
	
	
	Cookie ck1 = new Cookie("email", "Rishabh@gmail.com");
	resp.addCookie(ck1);
	
	
	
	req.getRequestDispatcher("ser1").forward(req, resp);
}
}
