package practice_questions_day1;

import java.util.Scanner;
public class SeventhProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the First Character of Color Code : ");
		char c = sc.next().charAt(0);
		
		switch(c) {
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'W':
			System.out.println("White");
			break;
		default:
			System.out.println("Invalid Code !!");
		}
	}
}
