package com.example.SpringAOP.RestAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringAOP.Service.UserService;

@RestController
public class Api {
	@Autowired
    private UserService userService;
	
	@GetMapping("/")
	public String userLogin() {
        // Call the method in MainService, which in turn calls the UserService
        userService.logIn();
        return "User login endpoint called successfully!";
    }
}
