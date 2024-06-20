package controller;

import java.io.IOException;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/reg")
public class RegistrationController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		User u = new User();
		u.setUname(uname);
		u.setEmail(email);
		u.setPass(pass);
		
		UserDao dao = new UserDao();
	
		if(id=="")
		{
			
			if(dao.IsEmailExist(u))
			{
				req.setAttribute("msg", "Email alredy Exist !!!!");
				req.getRequestDispatcher("home.jsp").forward(req, resp);
			}
			else
			{
				int i = dao.addUser(u);
				
				if(i>0)
				{
					req.setAttribute("msg", "Registration success");
					req.getRequestDispatcher("home.jsp").forward(req, resp);
				}
			}
		}
		else
		{
			u.setId(Integer.parseInt(id));
			int i = dao.UpdateUser(u);
			
			if(i>0)
			{
				req.setAttribute("msg", "Update success");
				req.getRequestDispatcher("home.jsp").forward(req, resp);
			}
		}
		
	
		
		
	}
}
