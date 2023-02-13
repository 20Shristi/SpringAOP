package com.springAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springAop.services.copy.PaymentService;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con= new ClassPathXmlApplicationContext("com/springAop/aopConfig.xml");
        PaymentService payment= con.getBean("payment", PaymentService.class);
        
        //auth,print,etc.
        
        payment.makePayment(); //joinpoint
        
        
    }
}
