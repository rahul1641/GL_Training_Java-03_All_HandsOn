//7.)Write a program to reverse a given number and print.

package practice_questions_day2;

import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		int rem;
		String s = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		while(num>0) {
			rem = num % 10;
			s = s + rem;
			num = num / 10;
		}
		
		System.out.print("Reverse of the Number is : "+ s);
		sc.close();
	}
}
