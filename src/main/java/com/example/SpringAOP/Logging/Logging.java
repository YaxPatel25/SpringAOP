package com.example.SpringAOP.Logging;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {
	
	@Before("execution(public void com.example.SpringAOP.Service.UserService.logIn")
	public void loggingAdvice1() {
		System.out.println("Before LogIn things is being excuted.");
	}
	
	@After("execution(public void com.example.SpringAOP.Service.UserService.logIn")
	public void loggingAdvice2() {
		System.out.println("After LogIn things is being excuted.");
	}
}
