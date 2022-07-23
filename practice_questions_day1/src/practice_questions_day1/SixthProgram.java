package practice_questions_day1;

import java.util.Scanner;
import java.lang.Character;
public class SixthProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Character : ");
		char c = sc.next().charAt(0);
		
		if(c>=65 && c<=90) {
			char res = Character.toLowerCase(c);
			System.out.println(res);
		}
		
		else if(c>=97 && c<=122) {
			char res = Character.toUpperCase(c);
			System.out.println(res);
		}
	}
}
