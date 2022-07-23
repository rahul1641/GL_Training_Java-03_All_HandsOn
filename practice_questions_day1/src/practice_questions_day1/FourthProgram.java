package practice_questions_day1;

import java.util.Scanner;
public class FourthProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Character : ");
		char c = sc.next().charAt(0);
		
		if((c>=65 && c<=90) && (c>=97 && c<=122)) {
			System.out.println("Alphabet");
		}
		else if(c>=48 && c<=57) {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}
	}
}
