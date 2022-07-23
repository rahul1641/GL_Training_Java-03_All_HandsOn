//11.)Write a program to initialize an integer array and find the maximum and minimum value of the array.

package practice_questions_day2;

import java.util.Scanner;
public class ArrayMinMax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println("Mininmum element in the array : "+min);
		System.out.println("Maximum element in the array : "+max);
		
		sc.close();
	}
}
