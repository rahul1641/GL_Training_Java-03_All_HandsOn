//15.)Write a program to initialize an array and print them in a sorted order.

package practice_questions_day2;

import java.util.Scanner;
public class ArraySorting {

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
		
		System.out.println("The Sorted Array is -->");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}

}
