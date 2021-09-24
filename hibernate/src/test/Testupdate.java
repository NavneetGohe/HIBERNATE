package test;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import pojo.User;

public class Testupdate {
	public static void main(String[] args) {
		
		User u = new User();
		u.setId(2);
		u.setName("Bking");
		SessionFactory ssn = new  Configuration().configure().buildSessionFactory();
		Session s =  ssn.openSession();
		Transaction tx = s.beginTransaction();
		
		s.update(u);
		tx.commit();
		s.close();
	}

}
