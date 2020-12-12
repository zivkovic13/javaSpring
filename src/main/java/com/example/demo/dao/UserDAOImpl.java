package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;
import com.example.demo.repository.HibernateUtil;

@Repository
public class UserDAOImpl implements UserDAO {
	

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

	@Transactional
	@Override
	public List<User> getAll() {
	Session currentSession = entityManager.unwrap(Session.class);
	Query<User> query = currentSession.createQuery("from User", User.class);
	List<User> list = query.getResultList();
	return list;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
}