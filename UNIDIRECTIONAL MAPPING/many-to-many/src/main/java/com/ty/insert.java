package com.ty;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class insert {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pournima");

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		Student student = new Student();
		student.setId(101);
		student.setName("Pournima");
		
		Subject s1 = new Subject();
		s1.setId(1);
		s1.setName("Java");
		
		Subject s2 = new Subject();
		s2.setId(2);
		s2.setName("Html");
		
		student.setSubjects(Arrays.asList(s1,s2));
		
		et.begin();
		em.persist(student);
		em.persist(s1);
		em.persist(s2);
		et.commit();
		
		System.out.println("saved");	
	}
		
}














