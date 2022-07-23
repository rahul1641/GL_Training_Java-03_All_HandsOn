//10.)Write a program to initialize an integer array and print the sum and average of the array.

package practice_questions_day2;

import java.util.Scanner;
public class ArraySumAvg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		int avg;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i]; 
		}
		
		avg = sum/arr.length;
		
		System.out.println("Sum of array elements is : "+sum);
		System.out.println("Avg. of array elements is : "+avg);
		
		sc.close();
	}
}
