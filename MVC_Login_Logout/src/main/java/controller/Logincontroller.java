package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/login")
public class Logincontroller extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		
		if(email.equals("admin") && pass.equals("admin"))
		{
			HttpSession session = req.getSession();
			session.setAttribute("user", "admin");
			
			ServletContext cx = req.getServletContext();
			req.setAttribute("cuser", cx.getAttribute("cuser"));
			req.setAttribute("tuser", cx.getAttribute("tuser"));
			
			
			req.getRequestDispatcher("home.jsp").forward(req, resp);
		}
		else
		{
			req.setAttribute("err","Invalid credentials");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
		
	}
}
