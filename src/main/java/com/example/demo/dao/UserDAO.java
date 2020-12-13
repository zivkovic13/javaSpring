package com.example.demo.dao;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;
import com.example.demo.repository.HibernateUtil;

@Repository
public class UserDAO {
	

	@Autowired
	private EntityManager entityManager;
	
	public static User getUser(String email) {
		
		Session session = HibernateUtil.getSession();
        session.beginTransaction();
        
        Query<User> query = session.createQuery("from User u WHERE "
        		+ "u.email = :email", User.class);
        query.setParameter("email", email);
        User userObject = (User) query.getSingleResult();
        
        session.getTransaction().commit();
        HibernateUtil.closeSession();

		System.out.println(userObject.getFirstName());
		return userObject;
	}
	
	
	public static void insertUser(String firstName, String lastName, 
			String email, String password) {
		
		Session session = HibernateUtil.getSession();
        session.beginTransaction();
        
        try {
        	User user = new User();
	        user.setFirstName(firstName);
	        user.setLastName(lastName);
	        user.setEmail(email);
	        user.setPassword(password);
        
	        session.save(user);
	        session.getTransaction().commit();
        } catch (PersistenceException  e) {
            System.out.println("email already exists");
        	
        }
        	HibernateUtil.closeSession();
    }
}