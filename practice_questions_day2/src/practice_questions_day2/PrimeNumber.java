//3.)Write a program to check if a given number is prime or not.

package practice_questions_day2;

import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a positive no. : ");
		int num = sc.nextInt();
		
		for(int i = 2; i <= num/2; i++ ) {
			if(num % i == 0) {
				flag = true;
				break;
			}
		}
		
		if(num == 1) {
			System.out.println("1 is neither prime nor composite");
		}
		else {
			if(flag == false) {
				System.out.println(num + " is a prime number.");
			}
			else {
				System.out.println(num + " is not a prime number");
			}
		}
			sc.close();
		
	}
}
