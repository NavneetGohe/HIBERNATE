package com.hib5.inheritance.pojo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity (name="Debit")
@Table (name="Debit")


public class Debit extends Account {
	
	private int overdraftFee;

	public int getOverdraftFee() {
		return overdraftFee;
	}

	public void setOverdraftFee(int overdraftFee) {
		this.overdraftFee = overdraftFee;
	}
	
	
}