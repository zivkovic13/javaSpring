package com.example.demo;

import org.hibernate.Session;

import com.example.demo.model.User;
import com.example.demo.repository.HibernateUtil;

public class UserMethods {
	
	
	
	public static void insertUser() {
		
		Session sessionOne = HibernateUtil.getSession();
	      sessionOne.beginTransaction();
	       
	      //Create new Employee object
	      User emp = new User();
	      emp.setId(5);
	      emp.setFirstName("Aca");
	      emp.setLastName("Lukas");
	       
	      //Save employee
	      sessionOne.save(emp);
	      sessionOne.getTransaction().commit();

		}
	
	
}