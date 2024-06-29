package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.google.gson.Gson;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/search")
public class Searchcontroller extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		String value = req.getParameter("value");
		
		UserDao dao = new UserDao();
		List<User> al = dao.searchUser(value);
		
		PrintWriter pw  =resp.getWriter();
		Gson gson =  new Gson();
		pw.append(gson.toJson(al));
		
	}
}
