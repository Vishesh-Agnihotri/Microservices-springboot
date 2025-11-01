package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

import jakarta.annotation.PostConstruct;

@RestController
@Scope("Prototype")
@RequestMapping("/user")
public class UserController {

	private User user;

	public UserController() {
		System.out.println("User controller");
	}
	
	@PostConstruct
	public void display() {
		System.out.println("Usercontroller bean hashcode"+this.hashCode());
		System.out.println("User controller user hashcode"+user.hashCode());
	}
}
