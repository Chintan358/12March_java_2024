package com;


import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONObject;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/payment")
public class Payment extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int amt = Integer.parseInt(req.getParameter("amt"));
		RazorpayClient razorpay;
		try {
			razorpay = new RazorpayClient("rzp_test_G8FRlfraLdQLto", "pa7XvBWygHrcS8QnsKoz2Lcw");

			JSONObject orderRequest = new JSONObject();
			orderRequest.put("amount",amt*100);
			orderRequest.put("currency","INR");
			orderRequest.put("receipt", "receipt#1");
			JSONObject notes = new JSONObject();
			notes.put("notes_key_1","Tea, Earl Grey, Hot");
			orderRequest.put("notes",notes);

			Order order = razorpay.orders.create(orderRequest);
			System.out.println(order);
			PrintWriter pw  =resp.getWriter();
			pw.append(order.toString());
			
			
		} catch (RazorpayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
	}
	
}
