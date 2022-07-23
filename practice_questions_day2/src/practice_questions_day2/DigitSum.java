//5.)Write a program to print the sum of all the digits of a given number.

package practice_questions_day2;

import java.util.Scanner;
public class DigitSum {

	public static void main(String[] args) {
		
		int rem, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter the number : ");
		int num = sc.nextInt();
		
		while(num>0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		
		System.out.print("Digit sum is : "+ sum);
		sc.close();
	}
}
