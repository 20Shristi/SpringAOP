package com.springAop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Myaspect {
  
	@Before("execution(* com.springAop.services.copy.PaymentServiceImpl.makePayment())")
	public void printBefore() {
		System.out.println("Payment Started..!!");
	}
}
