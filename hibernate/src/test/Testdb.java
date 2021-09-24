package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.tablepersubdis.Caaasssh;
import in.co.rays.tablepersubdis.Cheeeque;
import in.co.rays.tablepersubdis.CreeeditCard;

public class Testdb {
	
	public static void main(String[] args) {
		CreeeditCard ccd = new CreeeditCard();
		ccd.setAmount(10000);
		ccd.setCc_type("visa");
		ccd.setPayment_type("creditcard");
		
		Cheeeque che = new Cheeeque();
		che.setAmount(11000);
		che.setChq_nmb(122233);
		che.setBank_name("axix");
		che.setPayment_type("cheque");
		
		Caaasssh cs = new Caaasssh();
		cs.setAmount(12000);
		cs.setPayment_type("cash");
		
		SessionFactory ssnf = new Configuration().configure().buildSessionFactory();
		Session s= ssnf.openSession();
		Transaction tx = s.beginTransaction();
		s.save(ccd);
		s.save(che);
		s.save(cs);
		tx.commit();
		s.close();
		
	}

}
