package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePerson {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
	   Person person=new Person();
	   person.setName("soumya");
	   person.setEmail("soumya@gmal.com");
	   person.setPhone(98477479l);
	   
	   Pan pan=new Pan();
	   pan.setPanNumber(1999);
	   pan.setName("smita56");
	   pan.setAddress("banglore layout");
	   
	   person.setPan(pan);
	   pan.setPerson(person);
	   
	   
	    entityTransaction.begin();
	    entityManager.persist(person);
	    entityManager.persist(pan);
		entityTransaction.commit();

	}

}
