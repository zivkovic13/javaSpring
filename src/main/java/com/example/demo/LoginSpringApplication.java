package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.User;
import com.example.demo.repository.UsersRepository;

@SpringBootApplication
public class LoginSpringApplication {
	
	  @Autowired
	  private UsersRepository usersRepository;

	public static void main(String[] args) throws Exception {
		SpringApplication.run(LoginSpringApplication.class, args);		
		
		
		UserMethods.insertUser();
	}
	
 

}
