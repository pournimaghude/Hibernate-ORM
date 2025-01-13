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
		
		et.begin();
		Student student = em.find(Student.class, 101);
		et.commit();
		
		if (student!=null) {
			System.out.println("--------------Student----------------");
			System.out.println(student.getId());
			System.out.println(student.getName());
			
			System.out.println("--------------Subjects----------------");
			List<Subject> subjects = student.getSubjects();
			
			for(Subject subject: subjects) {
				System.out.println(subject.getId());
				System.out.println(subject.getName());
				System.out.println("------------------------------");

			}
		} else {
			System.out.println("not found");
		}
	}

}




















