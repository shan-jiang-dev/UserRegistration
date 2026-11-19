package com.example.UserRegistration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.UserRegistration.Entity.SimpleUser;
import com.example.UserRegistration.Service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String showRegistrationForm() {
		return "userregistration";
	}
	
	@RequestMapping("/register") //@ModelAttribute: Automatically binds form data to a Java object
	public String registerUser(@ModelAttribute SimpleUser simpleUser) {
		userService.saveUser(simpleUser);
		return "success";
	}

}
