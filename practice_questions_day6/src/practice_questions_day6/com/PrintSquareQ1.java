/*1) Get an input String from user and parse it to integer, if it is not a number it will throw number format exception Catch it and print "Entered input is not a valid format for an integer." or else print the square of that number. (Refer Sample Input and Output).



Sample input and output 1:

Enter an integer: 12

The square value is 144

The work has been done successfully

Sample input and output 2:

Enter an integer: Java

Entered input is not a valid format for an integer.*/

package practice_questions_day6.com;


public class PrintSquareQ1 {

	public static void main(String[] args) {
		
		System.out.println("Enter an Integer : "+args[0]);
		// command - line argument
		
		try {
			int num = Integer.parseInt(args[0]);
			int res = num * num;
			System.out.println("The Square vale is : "+res);
			System.out.println("The work has been done successfully.");
		}
		catch(NumberFormatException nfe) {
			System.out.println("Entered input is not a valid format for an integer "+nfe);
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}
	}
}
