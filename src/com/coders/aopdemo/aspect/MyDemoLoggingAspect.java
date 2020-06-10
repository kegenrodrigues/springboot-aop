package com.coders.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	@Before("execution(* com.coders.aopdemo.dao.*.*(..))")
	public void runBeforeAddAccount() {
		System.out.println("Buddy we are in the logging Aspect");
	}
}
