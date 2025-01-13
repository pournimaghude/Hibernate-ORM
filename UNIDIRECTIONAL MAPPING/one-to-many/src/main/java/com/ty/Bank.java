package com.ty;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	private int bid;
	
	private String name;
	
	private String address;
	
	@OneToMany
	private List<Account> accounts ;

	@Override
	public String toString() {
		return "Bank [bid=" + bid + ", name=" + name + ", address=" + address + ", accounts=" + accounts + "]";
	}
	
	public List<Account>getAccounts(){
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}	
}
