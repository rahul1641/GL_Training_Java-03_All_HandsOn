/*2)

•	Create an public class AreaOfCircle which implements an interface called Area Interface

Area interface has two abstract methods :1) public double CircleArea()

   2) public double circleCircumference ()

 in AreaOfCircle ‘s constructor add Reference of Another interface called “circumference”

After this, develop body of two implemented methods and return as follows:

public double CircleArea () will return ----” area of circle”

public double circleCircumference () will call the circleStatus() method(from another class) with the help of Constructor Parameter.

•	Create 2nd class as public class CircumferenceOfCircle which implements the “circumference” interface, this interface has one abstract method called

Public double circleStatus ();

CircumferenceOfCircle should have implementation of this method and

this method should return------“circumference of the circle”

•	now create 3rd class MainSpring and with the help of ApplicationContext get the bean of AreaOfCircle class.

Also call methods of this class with object.

•	Write your own business logic and take your own values for variables.

•	Create an XML file for bean configuration.

•	Use Maven (pom.xml) to add required dependencies for spring core and spring context.*/

package com.areaofcircle;

public class AreaOfCircle implements Area {
	
	private Circumference circum;
	private int radius;
	
	public AreaOfCircle(int radius) {
		this.radius = radius;
		this.circum =  new CircumferenceOfCircle();
	}
	
	public double circleArea() {
		
		return 3.14 * radius * radius;
	}
	
	public double circleCircumference() {
		
		return circum.circleStatus(radius);	
	}
}
