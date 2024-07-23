package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.StudentDetails;
import model.StudentLogin;

public class viewData {
	public static void main(String[] args) {
		
		
		
		SessionFactory sf =   new Configuration()
		.configure("hibernate.cfg.xml")
		.addAnnotatedClass(StudentDetails.class)
		.addAnnotatedClass(StudentLogin.class)
		.buildSessionFactory();
		
		
		Session s = sf.openSession();
		Transaction tx  =s.beginTransaction();
		
		
//		List<StudentLogin> login = s.createQuery("from StudentLogin").list();
//		
//		for(StudentLogin lg : login)
//		{
//			System.out.println(lg.getId()+" "+lg.getUsername()+" "+lg.getPassword()+" "+lg.getDetails().getFname()+" "+lg.getDetails().getLname()+" "+lg.getDetails().getEmail());
//		}
//	
		
		StudentLogin lg = s.get(StudentLogin.class, 3);
		System.out.println(lg);
		//System.out.println(lg.getId()+" "+lg.getUsername()+" "+lg.getPassword()+" "+lg.getDetails().getFname()+" "+lg.getDetails().getLname()+" "+lg.getDetails().getEmail());
		
		
	}
}
