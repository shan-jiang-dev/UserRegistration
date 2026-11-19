package com.example.UserRegistration.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.UserRegistration.Entity.SimpleUser;
import com.example.UserRegistration.Service.UserService;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String showRegistrationForm(Model model) {
		model.addAttribute("simpleUser", new SimpleUser());
		return "userregistration";
	}
	
	@RequestMapping("/register") //@ModelAttribute: Automatically binds form data to a Java object
	public String registerUser(@ModelAttribute @Valid SimpleUser simpleUser, BindingResult result) {
		if (result.hasErrors()) {
			return "userregistration";
		}
		userService.saveUser(simpleUser);
		return "success";
	}

}
