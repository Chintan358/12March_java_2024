package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.StudentDetails;
import model.StudentLogin;

public class AddData {
	public static void main(String[] args) {
		
		
		
		SessionFactory sf =   new Configuration()
		.configure("hibernate.cfg.xml")
		.addAnnotatedClass(StudentDetails.class)
		.addAnnotatedClass(StudentLogin.class)
		.buildSessionFactory();
		
		
		Session s = sf.openSession();
		Transaction tx  =s.beginTransaction();
		
		
		
		StudentDetails sd = new StudentDetails();
		sd.setFname("Tops");
		sd.setLname("Tech");
		sd.setEmail("topstech@gmail.com");
		
		
		StudentLogin lg = new StudentLogin();
		lg.setUsername("topstech");
		lg.setPassword("tops123");
		lg.setDetails(sd);
		
		s.save(lg);
		
		
		tx.commit();
		
		
		
		
	}
}
