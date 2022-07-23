//8.)Write a program to reverse a given number and print to find if the given number is palindrome or not.

package practice_questions_day2;

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {

		int temp, rem, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		temp = num;
		
		while(num>0) {
			rem =  num % 10;
			sum = sum * 10 + rem;
			num = num /10;
		}
		
		if(sum == temp) {
			System.out.println(sum+ " is a Palindrome No.");
		}
		else {
			System.out.println(sum+ " is not a Palindrome No.");
		}
		
	sc.close();
	}
}
