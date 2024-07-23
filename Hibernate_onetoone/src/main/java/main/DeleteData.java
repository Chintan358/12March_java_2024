package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.StudentDetails;
import model.StudentLogin;

public class DeleteData {
	public static void main(String[] args) {
		
		
		
		SessionFactory sf =   new Configuration()
		.configure("hibernate.cfg.xml")
		.addAnnotatedClass(StudentDetails.class)
		.addAnnotatedClass(StudentLogin.class)
		.buildSessionFactory();
		
		
		Session s = sf.openSession();
		Transaction tx  =s.beginTransaction();
		
		
		
		StudentLogin lg = s.get(StudentLogin.class, 1);
		s.delete(lg);
		
		tx.commit();
		
		
		
		
	}
}
