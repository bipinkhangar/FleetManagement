package com.example.demo.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@org.springframework.web.bind.annotation.RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {
	@Autowired
	private UserService service;
	
	@CrossOrigin(origins="http://localhost:8080")
	@PostMapping("/save-user")
	@Transactional
	public String registerUser(@RequestBody User user)
	{
		service.saveMyUser(user);
		return "Hello" + user.getUserfname() + "your registration is succesfull";
	}
	
	
}
