//Q.4)Create a class named ‘Animal’ which includes methods like eat() and sleep().
//Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().
//Create an instance of Animal class and invoke the eat and sleep methods using this object.
//Create an instance of Bird class and invoke the eat, sleep and fly methods using 
//this obCreate a class named ‘Animal’ which includes methods like eat() and sleep().

package practice_questions_day3.com;

class Animal {
	
	void eat() {
		System.out.println("Animals can eat.");
	}
	
	void sleep() {
		System.out.println("Animals can sleep.");
	}	
}

public class Bird extends Animal{
	
	void eat() {
		System.out.println("Bird can eat.");
	}
	
	void sleep() {
		System.out.println("Bird can sleep.");
	}
	
	void fly() {
		System.out.println("Bird can fly.");
	}
	
	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.eat();
		a.sleep();
		
		Bird b = new Bird();
		b.eat();
		b.sleep();
		b.fly();
		
	}
}

