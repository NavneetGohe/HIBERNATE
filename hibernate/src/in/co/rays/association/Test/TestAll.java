package in.co.rays.association.Test;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.association.AuctionItem;
import in.co.rays.association.Bid;

public class TestAll {
	
	public static void main(String[] args) {
		
		
		
		
		
		AuctionItem ai = new AuctionItem();
		ai.setDescription("bag");
		
		Bid bid = new Bid();
		bid.setAmount(600);
		//bid.setTimestamp(new Timestamp(new Date().getTime()));
		
		Bid bid1 = new Bid();
		bid1.setAmount(800);
		//bid1.setTimestamp(new Timestamp(new Date().getTime()));
		
		Bid bid2 = new Bid();
		bid2.setAmount(1000);
		//bid2.setTimestamp(new Timestamp(new Date().getTime()));
		
		
	   Set<Bid> bids = new HashSet<>() ;
	   bids.add(bid);
	   bids.add(bid1);
	   bids.add(bid2);
	   
	   ai.setBids(bids);
	   
	   
	   
	   SessionFactory ssnf = new Configuration().configure().buildSessionFactory();
	   Session s = ssnf.openSession();
	   Transaction tx = s.beginTransaction();
	   
	   s.save(ai);
	   tx.commit();
	   s.close();
		 
	   }
	}
	
	

