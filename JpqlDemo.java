package com.te.hibernate;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlDemo {

	public static void main(String[] args) {
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("player");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		/*
		 * to fetch the all the data from table
		 */
//		String query = "from Team";
//		Query createQuery = createEntityManager.createQuery(query);
//		List<Team> resultList = createQuery.getResultList();
//		for (Team team : resultList) {
//			System.out.println(team);
//		}
		/*
		 * get the single result
		 */
//		String query2 = "select min(salary) from Team";
//		Query createQuery = createEntityManager.createQuery(query2);
//		Object singleResult = createQuery.getSingleResult();
//		System.out.println(singleResult);

		/*
		 * Update the salary using query
		 */

//		EntityTransaction transaction = createEntityManager.getTransaction();
//		String query3 = "update Team set salary=:60000 where id=7";
//		transaction.begin();
//		Query createQuery = createEntityManager.createQuery(query3);
//		int executeUpdate = createQuery.executeUpdate();
//		transaction.commit();

		/*
		 * Delete the entry
		 */
//		EntityTransaction transaction = createEntityManager.getTransaction();
//		String query4 = "delete from Team where id=45";
//		transaction.begin();
//		Query createQuery2 = createEntityManager.createQuery(query4);
//		int executeUpdate2 = createQuery2.executeUpdate();
//		transaction.commit();

		/*
		 * update the salary using dynamically
		 */
		EntityTransaction transaction = createEntityManager.getTransaction();
		String query3 = "update Team set salary=:sal where id=:od";
		transaction.begin();
		Query createQuery = createEntityManager.createQuery(query3);
		createQuery.setParameter("sal", 1000.00);
		createQuery.setParameter("od", 1);
		int executeUpdate = createQuery.executeUpdate(); 
		transaction.commit();

	}

}
