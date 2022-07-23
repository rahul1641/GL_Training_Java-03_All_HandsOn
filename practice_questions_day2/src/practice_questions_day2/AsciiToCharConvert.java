//13.)Initialize an integer array with ascii values and print the corresponding character values in a single row.

package practice_questions_day2;

import java.util.Scanner;
public class AsciiToCharConvert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		char c[] = new char[arr.length];
		for(int i=0; i<arr.length; i++) {
			c[i] = (char)arr[i];
		}
		
		System.out.println("The corresponding character are as follows ---->");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		
		sc.close();
	}
}
