package com.fil.thinkFIL.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@GetMapping(path="/login")
	public String getLoginPage() {
		System.out.println("login route found");
		return "/login/login";
	}
	
	@PostMapping(path="/login")
	public void postLogin() {
		
	}
	
	@GetMapping(path="/signup")
	public String getSignupPage() {
		
		return "/signup/signup";
	}

}
