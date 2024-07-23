package controller;

import java.io.IOException;

import dao.ProductDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Product;

@WebServlet("/reg")
public class RegController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String pname = req.getParameter("pname");
		double price = Double.parseDouble(req.getParameter("price"));
		int qty = Integer.parseInt(req.getParameter("qty"));
		
		Product p = new Product();
		p.setPname(pname);
		p.setPrice(price);
		p.setQty(qty);
		
		String msg;
		ProductDao dao = new ProductDao();
		if(id=="")
		{
			msg = "Registration success";
		}
		else
		{
			int uid = Integer.parseInt(id);
			p.setId(uid);
			msg = "Update success";
		}
		
		
		
		
		
		boolean b = dao.addProduct(p);
		if(b)
		{
			req.setAttribute("msg", msg);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		else
		{
			req.setAttribute("err", "Something went wrong");
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
		
		
	}
}
