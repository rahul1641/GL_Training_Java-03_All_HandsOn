/*5) Write a Program with a division method which receives two integer numbers and performs the division operation.
The method should declare that it throws ArithmeticException. This exception should be handled in the main method.*/

package practice_questions_day6.com;

public class Division {

	public static void main(String[] args) throws ArithmeticException{
		
		System.out.println("Enter 1st number : "); // accept input using command line
		int a = Integer.parseInt(args[0]);
		System.out.println(a);
		
		System.out.println("Enter 2nd number : ");
		int b = Integer.parseInt(args[1]);
		System.out.println(b);
		
		try {
			System.out.println("Inside try block");
			double c = calculateDivision(a, b);
			System.out.println("After dividing the result is : "+c);
		}
		catch(ArithmeticException ae){
			System.out.println(ae);
		}
	}
	
	public static double calculateDivision(int a, int b) throws ArithmeticException {
		return a/b;
	}
}
