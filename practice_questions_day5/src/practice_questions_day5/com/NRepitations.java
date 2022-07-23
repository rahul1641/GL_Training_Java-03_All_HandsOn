/*Q.2.)Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string.

You may assume that n is between 0 and the length of the string, inclusive.

Example1)

i/p:Hello,3

o/p:llollollo*/

package practice_questions_day5.com;

import java.util.Scanner;
public class NRepitations {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s = sc.next();
		
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		
		int num = (s.length())-n;
		
		String temp = s.substring(num,s.length());
		
		String res = "";
		for(int i=0;i<temp.length();i++) {
			res += temp;
		}
		
		System.out.println("After 'n' repitations : " +res);
		
		sc.close();
	}
}
