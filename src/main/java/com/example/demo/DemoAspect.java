package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {
	@Pointcut("execution(public * *(..))")
	void isPublic() {
		// intentionally empty
	}

	@Pointcut("within(com.example..*)")
	void isPackage() {
		// intentionally empty
	}

	@Before("isPackage() && isPublic() ")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("Before method:" + joinPoint.getSignature());
	}
}
