//Q.2.)Create a new class called Calculator with the following methods:
//1. A static method called powerInt(int num1,int num2)
//This method should return num1 to the power num2.
//2. A static method called powerDouble(double num1,int num2).
//This method should return num1 to the power num2.
//3. Invoke both the methods and test the functionalities.


package practice_questions_day3.com;

public class Calculator {
	
	
	public Calculator() {
		System.out.println("No-arg Constructor");
	}

	static int powerInt(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}
	
	static double powerDouble(double num1, double num2) {
		return Math.pow(num1, num2);
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		int intResult = Calculator.powerInt(4, 2);
		System.out.println("Power of integer values = "+intResult);
		
		double doubResult = Calculator.powerDouble(2.5, 2.0);
		System.out.println("Power of double values = "+doubResult);

	}
}
