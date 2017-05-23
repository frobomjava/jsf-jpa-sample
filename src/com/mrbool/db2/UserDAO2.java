package com.mrbool.db2;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;

import com.mrbool.model2.User4;

public class UserDAO2 {
	
	EntityManagerFactory factory = Persistence .createEntityManagerFactory("testing"); 
	EntityManager em = factory.createEntityManager(); 
	
	public User4 getUser(String nameUser, String password) {
		try { User4 user = (User4) em .createQuery( "SELECT u from User4 u where u.nameUser = :name and u.password = :password") 
				.setParameter("name", nameUser)
				.setParameter("password", password).getSingleResult(); return user; 
				} catch (NoResultException e) { 
					return null; } }

	
	/*public boolean inserirUser(User4 user) {
		try {
			em.persist(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deletarUser(User4 user) {
		try {
			em.remove(user);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}*/

}
