package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pournima");

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		Car car = new Car();

		car.setCid(103);
		car.setBrand("Renge");

		Engine engine = new Engine();
		engine.setSid(112);
		engine.setCc(1000);
		
		


		et.begin();
		em.persist(car);
		em.persist(engine);
		et.commit();
		System.out.println("saved");

	}

}
