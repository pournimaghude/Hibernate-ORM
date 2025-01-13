package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pournima");

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		et.begin();

		Review r1 = em.find(Review.class, 3);
		et.commit();

		if (r1 != null) {
			System.out.println("-----------------Review-----------");
			System.out.println(r1.getId());
			System.out.println(r1.getMsg());

			System.out.println("-----------------Product-----------");
			Product product = r1.getProduct();
			System.out.println(product.getPid());
			System.out.println(product.getName());
			System.out.println(product.getPrice());

		} else {
			System.out.println("not found");

		}

	}

}
