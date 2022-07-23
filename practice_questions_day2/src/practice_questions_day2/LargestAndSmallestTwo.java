//14.)Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.

package practice_questions_day2;

import java.util.Scanner;
public class LargestAndSmallestTwo {

	public static void main(String[] args) {
		
		int temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("First Largest = "+arr[n-1]+", Second Largest = "+arr[n-2]);
		System.out.println("First Smallest = "+arr[0]+", Second Smallest = "+arr[1]);
		
		sc.close();
	}
}
