package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Addemployee {
	public static void main(String[] args) {
		
		
		Employee e = new Employee();
		e.setId(3);
		e.setName("test");
		e.setEmail("test@gmail.com");
		e.setSalary(50000);
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session s = sf.openSession();
		
		Transaction tx = s.beginTransaction();
		
		s.saveOrUpdate(e);
		
		tx.commit();
		
		
	}
}
