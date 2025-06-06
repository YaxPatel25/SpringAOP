package com.example.SpringAOP.Logging;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {
	
	@Before("execution(public void com.example.SpringAOP.Service.UserService.logIn())")
	public void loggingAdvice1() {
		System.out.println("Before LogIn things is being excuted.");
	}
	
	@Around("execution(public void com.example.SpringAOP.Service.UserService.logIn())")
    public void loggingAdvice3() {
        System.out.println("Before and After invoking method logIn");
    }

    @AfterThrowing("execution(public void com.example.SpringAOP.Service.UserService.logOut())")
    public void loggingAdvice4() {
        System.out.println("Exception thrown in logOut method");
    }

    @AfterReturning("execution(public void com.example.SpringAOP.Service.UserService.logOut())")
    public void loggingAdvice5() {
        System.out.println("AfterReturning advice for logOut is run");
    }

    @Pointcut("execution(public * com.example.SpringAOP.Service.UserService.*(..))")
    public void pointCut() {
    }
    @Pointcut("execution(public * com.example.SpringAOP.Service.UserService.*(..))")
    public void pointCut1() {
    }

    @Before("pointCut() || pointCut1()")
    public void loggingAdvice6() {
        System.out.println("Before advice using pointcut is executed");
    }
}
