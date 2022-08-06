package com.accountmanagement;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App

{

  public static void main( String[] args )

  {

    ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");

     Customer cus = ctx.getBean(Customer.class);
     
     System.out.println(cus);
     
     cus.getAccount().deposit(4000);
     cus.getAccount().withdraw(5000);
  }

}

