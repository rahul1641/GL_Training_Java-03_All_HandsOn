//6.)Write a program to print * in Floyds format (using for and while loop).

package practice_questions_day2;

import java.util.Scanner;
public class FloydsProgram {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		
		System.out.println("Floyd's Triangle ---> ");
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}
