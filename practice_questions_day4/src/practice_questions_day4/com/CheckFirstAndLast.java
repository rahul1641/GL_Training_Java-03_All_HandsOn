/*Q.7.)Given a string, if the first or last chars are 'x', return the string without those 'x' chars, otherwise return the string unchanged.

If the input is "xHix", then output is "Hi".

If the input is "America", then the output is "America"
*/

package practice_questions_day4.com;

import java.util.Scanner;
public class CheckFirstAndLast {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s = sc.next();
		
		if(s.charAt(0)=='x' && s.charAt(s.length()-1)=='x') {
			String res = s.substring(1,s.length()-1);
			System.out.println("After removing 'x' : "+res);
		}
		
		else {
			System.out.println("Output will be : "+s);
		}
		
		sc.close();
	}
}
