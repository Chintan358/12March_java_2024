package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Product;



public class ProductDao {
	
	SessionFactory sf;
	public ProductDao() {
		
		Configuration cfg = new Configuration();
		cfg.configure("util/hibernate.cfg.xml");
		cfg.addAnnotatedClass(Product.class);
		
		sf = cfg.buildSessionFactory();
		
	}
	
	
	public boolean addProduct(Product p)
	{
		Transaction tx = null;
		boolean b  =false;
		try {
			Session s = sf.openSession();
			tx  =s.beginTransaction();
			s.saveOrUpdate(p);
			tx.commit();
			b = true;
		} catch (Exception e) {
			
			tx.rollback();
			b= false;
		}
		
		return b;
	}
	
	public List<Product> viewAllProduct()
	{
		Transaction tx = null;
		Session s = sf.openSession();
		tx  =s.beginTransaction();
		return s.createQuery("from Product").list();
	}
	
	public Product productById(int id)
	{
		Transaction tx = null;
		Session s = sf.openSession();
		tx  =s.beginTransaction();
		return s.load(Product.class, id);
	}
	
	public void deleteProduct(int id)
	{
		Transaction tx = null;
		Session s = sf.openSession();
		tx  =s.beginTransaction();
		Product p = s.load(Product.class, id);
		s.delete(p);
		tx.commit();
	}

}
