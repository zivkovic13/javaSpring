package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.User;

public class UserService {
	
	@Autowired
    private UserRepository userRepository;
	
	List<User> getAll() {
		return userRepository.findAll();
		}

}
