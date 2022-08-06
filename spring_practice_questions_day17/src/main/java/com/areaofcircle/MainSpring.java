package com.areaofcircle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainSpring {

	public static void main(String[] args) {
		
		
//		ApplicationContext ctx=new AnnotationConfigApplicationContext(AreaOfCircleConfig.class);
//		AreaOfCircle ar = ctx.getBean(AreaOfCircle.class);
		
		 ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
	     AreaOfCircle ar = ctx.getBean(AreaOfCircle.class);
	     
		
		System.out.println("Area of Circle is : "+ar.circleArea());
	    System.out.println("Circumference of Circle is : " +ar.circleCircumference());
	    
	    
	}

}
