package test;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import pojo.User;



public class TestDelete  {
	public static void main(String[] args) {
		
		User u = new User();
        u.setId(5);
	
		
		
		SessionFactory ssnf = new Configuration().configure().buildSessionFactory();
		 
		Session s = ssnf.openSession();
		Transaction tx = s.beginTransaction();
		s.delete(u);
		tx.commit();
		System.out.println("data deleted");
		s.close();
		
		
	}

}
