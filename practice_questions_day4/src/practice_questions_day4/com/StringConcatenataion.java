/*Q.2.)Write a java program that will concatenate 2 strings and return the result.

The result should be in lowercase.

Note:If the concatenation creates a double-char, then one of the characters need to be omitted.

Example1)

i/p:Sachin,Tendulkar

o/p:sachin tendulkar

Example2)

i/p:Mark,kate

o/p:markate*/


package practice_questions_day4.com;

import java.util.Scanner;
public class StringConcatenataion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st String : ");
		String s1 = sc.next();
		
		System.out.println("Enter the 2nd String : ");
		String s2 = sc.next();
		
		if(s1.charAt(s1.length()-1) == s2.charAt(0)) {
			String temp = "";
			for(int i = 1;i<s2.length();i++) {
				temp += s2.charAt(i);
			}
			
			String res = s1.toLowerCase() + temp.toLowerCase();
			System.out.println("After Concatenation : "+res);
		}
		
		else {
			String res = s1.toLowerCase() + " " + s2.toLowerCase();
			System.out.println("After Concatenation : "+res);
		}
		
		sc.close();
	}

}
