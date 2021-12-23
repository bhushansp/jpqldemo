package com.te.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App_2 {

	public static void main(String[] args) {
	EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("player");
	EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
	EntityTransaction transaction = createEntityManager.getTransaction();
	/*
	 * Deleting the Data
	 */
	Team find = createEntityManager.find(Team.class, 18);
	transaction.begin();
	createEntityManager.remove(find);
	transaction.commit();
	
	/*
	 * Updating the data
	 */
	Team find2 = createEntityManager.find(Team.class,1);
	if(find2!=null) {
		find2.setDesignation("VC");
		transaction.begin();
		transaction.commit();
		System.out.println("Updated");
	}
	}

}
