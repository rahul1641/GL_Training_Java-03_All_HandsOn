package practice_questions_day1;

import java.util.Scanner;
public class ThirdProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Character : ");
		char c1 = sc.next().charAt(0);
		System.out.println("Enter the Second Character : ");
		char c2 = sc.next().charAt(0);
		
		if(c1>c2) {
			System.out.println("The output will be "+ c2 +", "+ c1);
		}
		else {
			System.out.println("The output will be "+ c1+", "+c2);
		}
	}
}
