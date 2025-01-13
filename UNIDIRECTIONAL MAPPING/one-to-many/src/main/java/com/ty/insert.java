package com.ty;

import java.util.Arrays;

//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class insert {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pournima");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Bank bank = new Bank();
		bank.setBid(101);
		bank.setName("BOB");
		bank.setAddress("Ambernath");
		
		Account a1 = new Account();
		a1.setAccNo(111);
		a1.setName("Pournima");
		a1.setBal(1000);
		
		Account a2 = new Account();
		a2.setAccNo(222);
		a2.setName("Akash");
		a2.setBal(2000);
		
		bank.setAccounts(Arrays.asList(a1, a2));
		
//		Arrays.asList(a1, a2);
		
//		List<Account> accounts = new ArrayList<Account>;
//		accounts.add((a1);
//		accounts.add((a2);
		
		et.begin();
		em.persist(bank);
		em.persist(a1);
		em.persist(a2);
		et.commit();
		System.out.println("saved");	
	}
}
