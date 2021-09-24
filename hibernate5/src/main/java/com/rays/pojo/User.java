package com.rays.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table (name="User")
public class User {
	
	@Id
	
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment" , strategy= "increment")
	@Column (name="id")
	private int id;

	@Column (name="FIRST_NAME")
	private String firstname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public char[] getId(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
