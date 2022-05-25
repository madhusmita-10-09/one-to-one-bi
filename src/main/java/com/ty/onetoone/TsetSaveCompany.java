package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TsetSaveCompany {

	public static void main(String[] args) {
		

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		   Company company=new Company();
		   company.setName("TCS");
		   company.setWeb("tcs.www.com");

		   
		    GST gst=new GST();
		   gst.setGstnumber(635353);
		   gst.setState("odisha");
		   
		   company.setGst(gst);
		   gst.setCompany(company);
		   
		   
		   
		    entityTransaction.begin();
		    entityManager.persist(company);
		    entityManager.persist(gst);
			entityTransaction.commit();

		
	}

}
