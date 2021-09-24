package in.co.rays.association;

import java.sql.Time;
import java.sql.Timestamp;

public class Bid {
	
	private int id;
	private int amount;
	private Timestamp Timestamp;
	private int Itemid;
	
	public Bid() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Timestamp getTimestamp() {
		return Timestamp;
	}

	public void setTimestamp(java.sql.Timestamp time) {
		Timestamp = time;
	}

	public int getItemid() {
		return Itemid;
	}

	public void setItemid(int itemid) {
		Itemid = itemid;
	}
}