package com.fil.thinkFIL.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	@GetMapping(path="/login")
	public String getLoginPage() {
		System.out.println("login route found");
		return "/login/login";
	}
	
	@GetMapping(path="/signup")
	public String getSignupPage() {
		return "/signup/signup";
	}

}
