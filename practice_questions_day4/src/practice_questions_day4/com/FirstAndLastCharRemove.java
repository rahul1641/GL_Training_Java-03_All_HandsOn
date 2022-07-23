//Q.5.)Write a java program that accepts a string and returns a new string without the first and last character of the input string.

/*Example1)

i/p:Suman

o/p:uma */

package practice_questions_day4.com;

import java.util.Scanner;
public class FirstAndLastCharRemove {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s = sc.next();
		
		String res = s.substring(1,s.length()-1);
		System.out.println("After removing 1st and last char : "+res);
		
		sc.close();
	}
}
