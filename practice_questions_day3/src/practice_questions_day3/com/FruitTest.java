//Q.7.)Create a base class Fruit with name ,taste and size as its attributes.
//Create a method called eat() which describes the name of the fruit and its taste.
//Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.


package practice_questions_day3.com;

class Fruit{
	
	String fName;
	String taste;
	String size;
	
	public Fruit(String fName, String taste, String size) {
		this.fName = fName;
		this.taste = taste;
		this.size = size;
	}

	void eat() {
		System.out.println("Fruit Name : "+fName);
		System.out.println("Fruit Taste : "+taste);
	}
}

class Apple extends Fruit{
	
	public Apple(String fName, String taste, String size) {
		super(fName, taste, size);
	}
	
	void eat() {
		super.eat();
		System.out.println("Apple size is : "+super.size);
	}
}

class Orange extends Fruit{
	
	public Orange(String fName, String taste, String size) {
		super(fName, taste, size);
	}
	
	void eat() {
		super.eat();
		System.out.println("Orange size is : "+super.size);
	}
}

public class FruitTest {

	public static void main(String[] args) {
		
		Apple a = new Apple("Apple","Sweet","Medium");
		a.eat();
		
		System.out.println();
		
		Orange o = new Orange("Orange","Sour","Large");
		o.eat();
	}
}
