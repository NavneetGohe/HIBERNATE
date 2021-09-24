package com.hib5.inheritance.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hib5.inheritance.pojo.Account;
import com.hib5.inheritance.pojo.Credit;
import com.hib5.inheritance.pojo.Debit;
import com.rays.util.UserUtil;

public class TestAcoount {
public static void main(String[] args) throws Exception {
	
	Credit c = new Credit();
	c.setCreditLimit(800);
	
	Debit d = new Debit();
	d.setBalance(776d);
	d.setOverdraftFee(75);
	
	
	SessionFactory ssnf =  UserUtil.getSeccionFactory();
	Session s = ssnf.openSession();
	Transaction tx = null;
	try {
		tx=s.beginTransaction();
		Account a= new Account();
		a.setBalance(6567587d);
		s.save(a);
		s.save(c);
		s.save(d);
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
