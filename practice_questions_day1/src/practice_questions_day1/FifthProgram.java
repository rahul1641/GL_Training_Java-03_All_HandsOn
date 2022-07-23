package practice_questions_day1;

import java.util.Scanner;
public class FifthProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Gender : ");
		String gen = sc.next();
		System.out.println("Enter the Age : ");
		int age = sc.nextInt();
		
		if(gen.equalsIgnoreCase("Male")) {
			if(age>=1 && age<= 58) {
				System.out.println("Interest is 8.4%.");
			}
			else if(age>=59 && age<=100) {
				System.out.println("Interest is 10.5%.");
			}
		}
		
		else if(gen.equalsIgnoreCase("Female")) {
			if(age>=1 && age<=58) {
				System.out.println("Interest is 8.2%.");
			}
			else if(age>=59 && age<=100) {
				System.out.println("Interest is 9.2%.");
			}
		}
		
	}
}
