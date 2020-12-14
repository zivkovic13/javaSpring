package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ApplicationController {
	
	@GetMapping(value = {"", "/", "/login"})
	public String userLogin() {
		return "login";                     
	}
	
	@GetMapping("/register")
	public String userRegistration() {
		return "register";
	}
}
