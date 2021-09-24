package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.tablepersubclass.Chequezz;
import in.co.tablepersubclass.CreditCard;

public class TestTableSuperClass {
	public static void main(String[] args) {
		
		CreditCard cd = new CreditCard();
	 cd.setAmount(100);
	 cd.setCctype("atm");
	 
	 Chequezz che = new Chequezz();
	 che.setAmount(500);
	 che.setCheq_nmb(1345);
	 
	 SessionFactory ssnf =  new Configuration().configure().buildSessionFactory();
	 Session s= ssnf.openSession();
	 Transaction tx = s.beginTransaction();
	 s.save(cd);
	 s.save(che);
	 tx.commit();
	 s.close();
	}

}
