package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteEngine {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pournima");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Engine e = em.find(Engine.class, 222);
		
		if(e!=null) {
			
			Car car = em.find(Car.class, 102);
			car.setEngine(null);
			em.merge(car);
			
			em.remove(e);
			et.commit();
			
			System.out.println("engine delete");
		} else {
			System.out.println("not found");
		}
	}	
}
