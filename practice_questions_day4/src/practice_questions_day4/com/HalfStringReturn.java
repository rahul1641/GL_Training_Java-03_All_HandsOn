/*Q.4.)Write a java program that will return the first half of the string, if the length of the string is even.

It should return null for odd length string.
*/

package practice_questions_day4.com;

import java.util.Scanner;
public class HalfStringReturn {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s = sc.next();
		
		if(s.length() % 2 == 0) {
			int num = s.length()/2;
			
			String res = "";
			for(int i=0;i<num;i++) {
				res += s.charAt(i);
			}
			System.out.println("Even Length String Output : "+res);
		}
		
		else {
			System.out.println("null");
		}
		
		sc.close();
	}
}
