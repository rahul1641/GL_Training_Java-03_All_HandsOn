package practice_questions_day1;

import java.util.Scanner;
public class FirstProgram {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("Positive Number");
		}
		else if(num<0) {
			System.out.println("Negative Number");
		}
		else {
			System.out.println("The number is zero");
		}
	}
}
