/*Q.6.)Given 2 strings, a and b, return a new string of the form short+long+short, with the shorter string on the outside and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).

If input is "hi" and "hello", then output will be "hihellohi"*/

package practice_questions_day4.com;

import java.util.Scanner;
public class ShortLongShortCombo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st String : ");
		String s1 = sc.next();
		System.out.println("Enter the 2nd String : ");
		String s2 = sc.next();
		
		 if(s1.length()>s2.length()) {
			String res = s2 + s1 + s2;
			System.out.println("After Combining : "+res);
		}
		 
		 else if(s1.length()<s2.length()) {
			 String res = s1 + s2 + s1;
			 System.out.println("After Combining : "+res);
		 }
		 
		 else {
			 System.out.println("Length equal of both the strings");
		 }
		 
		 sc.close();
	}
}
