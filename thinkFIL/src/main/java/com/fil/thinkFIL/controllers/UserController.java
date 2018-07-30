package com.fil.thinkFIL.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.fil.thinkFIL.dao.models.User;
import com.fil.thinkFIL.repoInterfaces.UserRepoInterface;
import com.fil.thinkFIL.services.UserAuthentication;

@Controller
public class UserController {
	@Autowired
	private UserRepoInterface userRepo;
	
	@Autowired
	private UserAuthentication userAuth;

	@GetMapping(path="/login")
	public String getLoginPage() {
		System.out.println("login route found");
		return "login/login";
	}
	@GetMapping(path="/signup")
	public String getSignUpPage(@ModelAttribute("user") User user) {
		System.out.println("hello signup");
		 return "signup/signup";
	}
	@PostMapping(path="/signup")
	public String registerNewUser(@Valid @ModelAttribute("user") User user,BindingResult result,ModelMap model) {
		if(userAuth.checkUnregisteredUser(user.getUserName())) {
			//user.setPassword(userAuth.passwordEncryption(user.getPassword()));
			userRepo.save(user);
		}
		else {
			model.addAttribute("error", "user already exist");
			return "signup/signup";
		}
		return "signup/signup";
	}
	

}
