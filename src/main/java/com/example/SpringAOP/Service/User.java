package com.example.SpringAOP.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
//@AllArgsConstructor
public class User{
	String name;
	int age;
	String address;
		
	public User(String name, int age, String address) {
	    this.name = name;
	    this.age = age;
	    this.address = address;
	}
}
