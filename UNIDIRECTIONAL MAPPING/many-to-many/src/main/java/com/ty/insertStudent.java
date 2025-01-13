package com.ty;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class insertStudent {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Pournima");

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();
		
		Student student = new Student();
		student.setId(102);
		student.setName("Akash");
		
		//Java, HTML, SQL
		Subject s1 = new Subject();
		s1.setId(3);
		s1.setName("SQL");
		
//		Java
		Subject s2 = em.find(Subject.class, 1);
		
//		HTML
		Subject s3 = em.find(Subject.class, 2);
		
		student.setSubjects(Arrays.asList(s1, s2, s3));

		et.begin();
		em.persist(student);
		em.persist(s1);
		et.commit();
		System.out.println("saved");
	}

}











