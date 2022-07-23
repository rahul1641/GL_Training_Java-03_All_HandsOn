//2.)Write a program to print even numbers between 23 and 57.

package practice_questions_day2;

public class OddEvenWithRange {

	public static void main(String[] args) {
		
		for(int i=23;i<=57;i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
}
