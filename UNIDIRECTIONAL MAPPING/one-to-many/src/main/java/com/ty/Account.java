package com.ty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	
	@Id
	private int accNo;
	
	private String name;
	
	private double bal;

	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", bal=" + bal + "]";
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}	
}
