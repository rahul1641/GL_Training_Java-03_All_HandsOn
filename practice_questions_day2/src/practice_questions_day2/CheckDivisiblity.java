//9.)Write a program to print first 5 values which are divisible by 2, 3, and 5.

package practice_questions_day2;

public class CheckDivisiblity {

	public static void main(String[] args) {
		
		int count = 0;
		int num = 1;
		
		System.out.println("First 5 No.'s which are divisible by 2, 3 and 5 are : ");
		while(count!=5) {
			if(num%2==0 && num%3==0 && num%5==0) {
				System.out.print(num+" ");
				count++;
			}
			num++;
		}
	}
}
