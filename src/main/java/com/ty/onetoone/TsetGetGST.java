package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TsetGetGST {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		GST gst=entityManager.find(GST.class, 1);
		System.out.println("GST NUMBER: "+gst.getGstnumber());
		System.out.println("GST STATE  : "+gst.getState());
		
		
		Company company=gst.getCompany();
		System.out.println("Company  name :"+company.getName());
		System.out.println("company website is: "+company.getWeb());
		
		
		
	}

}
