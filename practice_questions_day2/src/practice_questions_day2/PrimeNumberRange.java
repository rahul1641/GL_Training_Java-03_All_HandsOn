//4.)Write a program to print prime numbers between 10 and 99.

package practice_questions_day2;

import java.util.Scanner;
public class PrimeNumberRange {

	public static void main(String[] args) {
		
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the lower bound : ");
		int n1 = sc.nextInt();
		System.out.println("Enter the upper bound : ");
		int n2 = sc.nextInt();
		
		System.out.print("Prime No.'s are : ");
		for(int i = n1; i <= n2; i++) {
			if(i == 0 || i == 1) {
				continue;
			}
			
			flag = true;
			for(int j = 2; j <= 2; j++) {
				if(i % j == 0) {
					flag = false;
					break;
				}
			}
			
			if(flag == true) {
				System.out.print(i+" ");
			}
		}
			sc.close();	
	}
}
