package com.springboot.thymeleaf.jdbc.authentication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String showMyLoginPage() {
		
		return "login";
		
	}

	
	@GetMapping("/error")
	public String showAccessDenied() {
		
		return "access-denied";
		
	}
	
}