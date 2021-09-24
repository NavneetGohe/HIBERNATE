package test;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import pojo.User;

public class TestGet {
	public static void main(String[] args) throws Exception {
		
		 authenticate();
		
		/*SessionFactory ssn = new Configuration().configure().buildSessionFactory();
		Session s = ssn.openSession();
		
		User u =  (User) s.get(User.class, 2);
		System.out.println(u.getId());
		System.out.println(u.getName());
		
		s.clear();
		
        User u1 =  (User) s.get(User.class, 4);
        System.out.println(u1.getId());
        System.out.println(u1.getName());
        s.close();
        ssn.close();
		*/
		
		
		
	}


	public static User authenticate() throws Exception {
	SessionFactory ssn1= new Configuration().configure().buildSessionFactory();
	Session s1 =  ssn1.openSession();
	
	Query q = s1.createQuery("from User where name=?");
	q.setString(0, "shubham");
	
	List list = q.list();
	
	if (list.size()==1) {
		
		User u = (User)list.get(0);
		System.out.println(u.getName());
		
	}else  {
	throw new Exception("login.invalid.user");
	}
	return null;	
	}

}
