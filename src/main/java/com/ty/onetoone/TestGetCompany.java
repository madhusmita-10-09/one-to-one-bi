package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetCompany {

	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Company company=entityManager.find(Company.class, 1);
		System.out.println("Company  name :"+company.getName());
		System.out.println("company website is: "+company.getWeb());
		
		GST gst=company.getGst();
		System.out.println("GST NUMBER: "+gst.getGstnumber());
		System.out.println("GST STATE  : "+gst.getState());
		

	}

}
