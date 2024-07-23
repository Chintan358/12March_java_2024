package controller;

import java.io.IOException;

import dao.ProductDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Product;

@WebServlet("/update")
public class Updatecontroller extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int uid = Integer.parseInt(req.getParameter("uid"));
		String action = req.getParameter("action");
		ProductDao dao = new ProductDao();
		if(action.equals("delete"))
		{
			dao.deleteProduct(uid);
			req.getRequestDispatcher("display").forward(req, resp);
			
		}
		else if(action.equals("edit"))
		{
			Product p =  dao.productById(uid);
			req.setAttribute("data", p);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		
	}
	
	
	
}
