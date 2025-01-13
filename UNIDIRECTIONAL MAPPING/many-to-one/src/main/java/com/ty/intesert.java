package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class intesert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pournima");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Product product = new Product();
		product.setPid(101);
		product.setName("samsung Phone");
		product.setPrice(4000);
		
		Review r1 = new Review();
		r1.setId(1);
		r1.setMsg("Good");
		r1.setProduct(product);
		
		Review r2 = new Review();
		r2.setId(2);
		r2.setMsg("Not working");
		r1.setProduct(product);
		
		et.begin();
		em.persist(product);
		em.persist(r1);
		em.persist(r2);
		et.commit();
		
		System.out.println("saved");

		
		
		
		
		
		
		
		
	}
	
	

}
