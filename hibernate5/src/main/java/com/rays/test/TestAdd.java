package com.rays.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rays.pojo.User;
import com.rays.util.UserUtil;

public class TestAdd {
	public static void main(String[] args) throws Exception {
		
		SessionFactory ssnf = UserUtil.getSeccionFactory();
		Session s= ssnf.openSession();
		Transaction tx= null;
		
		try {
			tx = s.beginTransaction();
			User u = new User();
			u.setFirstname("shubham");
			
			s.save(u);
			tx.commit();
			
		} catch (Exception e) {
        tx.rollback();
		}
		finally {
			s.close();
UserUtil.shutdown();			
		}
		
	}

}
