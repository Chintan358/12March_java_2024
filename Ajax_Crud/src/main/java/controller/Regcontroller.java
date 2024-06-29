package controller;

import java.io.IOException;
import java.io.PrintWriter;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/reg")
public class Regcontroller  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		User u = new User();
		u.setUname(uname);
		u.setEmail(email);
		u.setPass(pass);
		
		UserDao dao = new UserDao();
		int i = dao.addUser(u);
		
		if(i>0)
		{
			PrintWriter pw = resp.getWriter();
			pw.append("Registation success!!!");
		}
	}
}
