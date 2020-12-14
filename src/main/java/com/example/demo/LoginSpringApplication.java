package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.UserDAO;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class LoginSpringApplication {
	
	@Autowired
    UserRepository repository;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(LoginSpringApplication.class, args);	
		
		// UserDAO.insertUser(null, null, null, null);
		// UserDAO.getUser("bzvzz@mail.com");
		
	}

}