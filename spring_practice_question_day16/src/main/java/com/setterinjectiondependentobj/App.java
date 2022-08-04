package com.setterinjectiondependentobj;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App

{
  public static void main( String[] args )

  {
    ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");

    Employee ob=ctx.getBean(Employee.class);
    
    System.out.println(ob);
    //ob.show();

  }
}