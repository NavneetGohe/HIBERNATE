package com.rays.test;

import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.rays.pojo.User;
import com.rays.util.UserUtil;

public class TestCriteria {
	
	public static void main(String[] args) throws Exception {
		
		
		
			
		

		SessionFactory ssnf = UserUtil.getSeccionFactory();
		Session s = ssnf.openSession();
		
		CriteriaBuilder cb = s.getCriteriaBuilder();
		
		CriteriaQuery<User> query = cb.createQuery(User.class);
		
		Root<User> root = query.from(User.class);
		query.select(root);
		Query q = s.createQuery(query);
		
		List<User> u = q.getResultList();
		
		Iterator<User> list =u.iterator();
		while (list.hasNext()) {
			User uv = (User) list.next();
			System.out.println(uv.getId());
			System.out.println(uv.getFirstname());
			
		}
		}
			
		}
		
	



