package com.hib5.inheritance.pojo;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity (name="Account")
@Table (name="Account")
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn



public class Account {
	
	@Id 
	@GeneratedValue(strategy =GenerationType.AUTO)
	
	private long id;
	
	private double balance;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
	
}

