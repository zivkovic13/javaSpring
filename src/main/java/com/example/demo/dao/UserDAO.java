package com.example.demo.dao;


import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;
import com.example.demo.repository.HibernateUtil;

@Repository
public class UserDAO {
	

	@Autowired
	private EntityManager entityManager;
	
	
	public static void insertUser() {
		
		Session session = HibernateUtil.getSession();
        session.beginTransaction();
        
        //Add new Employee object
        User emp = new User();
        emp.setEmail("lokesh@mail.com");
        emp.setFirstName("lokesh");
        emp.setLastName("gupta");
        emp.setPassword("brabo");
         
        //Save the employee in database
        session.save(emp);
 
        //Commit the transaction
        session.getTransaction().commit();
        HibernateUtil.closeSession();
    }
	
}