package com.rays.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rays.pojo.User;
import com.rays.util.UserUtil;

public class TestGet {
public static void main(String[] args) throws Exception {
	
	SessionFactory ssnf = UserUtil.getSeccionFactory();
	Session s = ssnf.openSession();
	
	User u = (User)s.get(User.class, 1);
	System.out.println(u.getId());
	System.out.println(u.getFirstname());
	s.close();
	UserUtil.shutdown();
	
}
}
