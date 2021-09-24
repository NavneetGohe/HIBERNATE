package in.co.rays.association.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.association.Address;
import in.co.rays.association.Employee;

public class TestEmployee {
	public static void main(String[] args) {
		
		
		
		Employee e = new Employee();
		e.setName("devraj");
		
		
		Address a =  new Address();
		a.setAddress("bhopal");
		
		e.setAddress(a);
		a.setEmployee(e);
		
		SessionFactory ssnf = new Configuration().configure().buildSessionFactory();
		Session s = ssnf.openSession();
		Transaction tx = s.beginTransaction();
		s.update(e);
		System.out.println("ono maapping done");
		tx.commit();
		s.close();
	}

}
