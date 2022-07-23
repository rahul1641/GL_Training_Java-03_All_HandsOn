/*Q.1.)Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on.

Any characters left, will go to the end of the result.

Example1)

i/p:Hello,World

o/p:HWeolrllod*/

package practice_questions_day5.com;

import java.util.Scanner;
public class CharSideBySide {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st String : ");
		String s1 = sc.next();
		System.out.println("Enter the 2nd String : ");
		String s2 = sc.next();
		
		String arr1[] = s1.split("");
		String arr2[] = s2.split("");
		
		String a1="";
		if(arr1.length>arr2.length) {
			a1 = s1.substring(arr2.length,arr1.length);
		}
		
		//System.out.println(a1);
		
		String a2="";
		if(arr1.length<arr2.length) {
			a2 = s2.substring(arr1.length,arr2.length);
		}
		
		//System.out.println(a2);
		
		if(arr1.length == arr2.length) {
			int i=0,j=0,c=0;
			String res = "";
			for(int k=0;k<arr1.length*2;k++) {
				if(c%2 ==0) {
					res += arr1[i];
					i++;
					c++;
				}
				else {
					res += arr2[j];
					j++;
					c++;
				}
			}
			System.out.println(res);
		}
		
		else if(arr1.length>arr2.length) {
			int i=0,j=0,c=0;
			String res = "";
			for(int k=0;k<arr2.length*2;k++) {
				if(c%2 ==0) {
					res += arr1[i];
					i++;
					c++;
				}
				else {
					res += arr2[j];
					j++;
					c++;
				}
			}
			String res1 = res + a1;
			System.out.println(res1);
		}
		
		else {
			int i=0,j=0,c=0;
			String res = "";
			for(int k=0;k<arr1.length*2;k++) {
				if(c%2 ==0) {
					res += arr1[i];
					i++;
					c++;
				}
				else {
					res += arr2[j];
					j++;
					c++;
				}
			}
			String res2 = res + a2;
			System.out.println(res2);
		}
		
	sc.close();
	}
}
