package com.example.UserRegistration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserRegistration.Entity.SimpleUser;
import com.example.UserRegistration.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public void saveUser(SimpleUser simpleUser) {
		userRepository.save(simpleUser);
	}
}
