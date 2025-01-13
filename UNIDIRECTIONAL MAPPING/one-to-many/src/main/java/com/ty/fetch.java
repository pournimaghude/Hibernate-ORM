package com.ty;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pournima");

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		Bank bank = new Bank();

		if (bank != null) {
			System.out.println("--------------bank---------");
			System.out.println(bank);

			List<Account> accounts = bank.getAccounts();
			System.out.println("---------accounts---------");
			for (Account account : accounts) {
				System.out.println("accounts");
			}
		} else {
			System.out.println("not found");
		}
	}
}
