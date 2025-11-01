package com.example.demo.model;

import jakarta.annotation.PostConstruct;

public class User {
	String  name;
	int id;
	public User(String name, int id) {
		System.out.println("User model class");
		this.name = name;
		this.id = id;
	}
	@PostConstruct
	public void display() {
		System.out.println("Hashcode inside user class" + this.hashCode());
	}

}
