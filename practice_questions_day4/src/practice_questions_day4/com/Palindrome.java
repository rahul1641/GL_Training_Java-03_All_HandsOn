//1.)Write a Program to check whether a given String is Palindrome or not.

package practice_questions_day4.com;

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String s = sc.next();
		
		String res = "";
		
		for(int i=s.length()-1;i>=0;i--) {
			res = res +  s.charAt(i) ;
		}
		
		if(res.equals(res)) {
			System.out.println("String is Palindrome");
		}
		
		else {
			System.out.println("String is not Palindrome");
		}
		sc.close();
	}
}
