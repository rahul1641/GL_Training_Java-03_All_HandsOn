/*4) Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result.

Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.*/


package practice_questions_day6.com;

public class MathOperation {

	public static void main(String[] args) {
		
		try {
			System.out.println("Inside try-block");
			
			System.out.println("Enter the 5 array elements through command line -->");
			for(int i=0;i<5;i++) {
				System.out.println(Integer.parseInt(args[i]));
			}
			
			int sum = 0;
			int avg = 0;
			
			for(int i=0;i<5;i++) {
				sum += Integer.parseInt(args[i]);
			}
			
			avg = sum/5;
			System.out.println("Sum is : "+sum);
			System.out.println("Avg is : "+avg);
			
			int avg1 = sum/0;
			System.out.println("Once again calculating average : "+avg1);
		}
		
		catch(NumberFormatException nfe) {
			System.out.println(nfe);
		}
		
		catch(ArithmeticException ae) {
			System.out.println("While calculating average again "+ae);
		}
		
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}
		
	}
}
