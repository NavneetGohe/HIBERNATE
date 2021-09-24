package com.hib5.inheritance.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="Credit")
@Table (name= "Credit")
public class Credit extends Account {
	
	private int creditLimit;

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	

}
