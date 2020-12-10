package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.User;



@Repository
public interface UsersRepository extends CrudRepository<User, Long>{

	// User findbyEmail(String email);
}
