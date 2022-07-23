//12.)Write a program to initialize an integer array with values and check if a given number is present in the array or not.

package practice_questions_day2;

import java.util.Scanner;
public class ArrayElementSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the array elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the element to Search : ");
		int search = sc.nextInt();
		
		int index=-1;
		boolean flag = false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==search) {
				index = i;
				flag = true;
			}			
		}
		
		if(flag) {
			System.out.println(search+" is found at "+index+ " position");
		}
		else {
			System.out.println(-1);
		}
		
		sc.close();
	}
}
