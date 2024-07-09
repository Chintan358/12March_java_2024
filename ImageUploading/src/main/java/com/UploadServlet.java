package com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/upload")
@MultipartConfig
public class UploadServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		Part file = req.getPart("file");
		
		String filename =  Paths.get(file.getSubmittedFileName()).getFileName().toString();
		filename = System.currentTimeMillis()+"_"+uname+"_"+filename;
		System.out.println(uname+" "+filename);
	
		String basePath = req.getServletContext().getRealPath("")+File.separator+"img";
		
		File path = new File(basePath);
		if(!path.exists())
		{
			path.mkdir();
		}
		file.write(basePath+File.separator+filename);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_rishabh","root","");
			PreparedStatement ps = cn.prepareStatement("insert into upload values(?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, uname);
			ps.setString(3, filename);
			
			int i = ps.executeUpdate();
			
			if(i>0)
			{
				req.getRequestDispatcher("index.jsp").forward(req, resp);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
