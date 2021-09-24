package test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.inheritance.Cheaque;
import in.co.rays.inheritance.CreditCard;

public class TestInheritance {
	public static void main(String[] args) {
		
		
		
		CreditCard cc = new CreditCard();
		cc.setAmount(3445);
		cc.setCctype(3434f);
		
		
		Cheaque che = new Cheaque();
		che.setAmount(5000);
		che.setCheque_nmb(21334);
		
		
		
		SessionFactory ssnf = new Configuration().configure().buildSessionFactory();
		Session s = ssnf.openSession();
		Transaction tx = s.beginTransaction();
		s.save(cc);
		s.save(che);
		tx.commit();
		s.close();
		
		
		
		
	}

}
