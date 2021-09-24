package test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import pojo.User;

public class TestList {
	
	public static void main(String[] args) {
		
		SessionFactory ssnf = new Configuration().configure().buildSessionFactory();
		Session s = ssnf.openSession();
	Query q = 	s.getNamedQuery("allUser");
	
	List l = q.list();
	Iterator it = l.iterator();
	User pojo;
	while (it.hasNext()) {
	  pojo = (User) it.next();
	  System.out.println(pojo.getId());
	  System.out.println(pojo.getName());
		
	}
	
	
		
	}

}
