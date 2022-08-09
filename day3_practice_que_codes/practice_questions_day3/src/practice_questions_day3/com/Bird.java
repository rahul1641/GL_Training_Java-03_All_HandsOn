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

