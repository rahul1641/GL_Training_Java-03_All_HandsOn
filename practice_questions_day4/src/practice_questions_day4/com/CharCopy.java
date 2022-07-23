/*
 Q.3.)Given a string, return a new string made of 'n' copies of the first 2 chars of the original string

where 'n' is the length of the string.

Example1)

i/p:Hello

o/p:HeHeHeHeHe
 
 */

package practice_questions_day4.com;

import java.util.Scanner;
public class CharCopy {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s = sc.next();
		
		String res = "";
		for(int i=0;i<=1;i++) {
			res += s.charAt(i);
		}
		
		String output = "";
		for(int i=0;i<s.length();i++) {
			output += res;
		}
		
		System.out.println("After Copying the character 'n' times : " +output);
		
		sc.close();
	}
}
