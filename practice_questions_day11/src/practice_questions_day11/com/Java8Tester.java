/*Write a program in Java to demonstrate Java 8 Functional Interface Predicate feature. The class will print all numbers , even numberrs and number greater than 3 of the numbers in the array list

Step1: create Java main class Java8 Tester

Step2: create a method eval which will take 2 parameters (list of numbers from 1 to 9 and predicate condition)

Step3: call the eval method from main method to print all the even numbers by passing appropriate parameters

Step4: call the eval method from main method to print all the numbers greater than 3 by passing appropriate parameters

Sample output

Print all numbers:

1

2

3

4

5

6

7

8

9

Print even numbers:

2

4

6

8

Print numbers greater than 3:

4

5

6

7

8

9
*/

package practice_questions_day11.com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java8Tester {
	
	public static void eval(List<Integer> list, Predicate<Integer> pred) {
		
		for(Integer i : list) {
			if(pred.test(i)) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		
		List<Integer> alist = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		System.out.println("Print all Numbers : ");
		eval(alist,(num)->num>0);
		
		System.out.println();
		System.out.println("Print even Numbers : ");
		eval(alist, (num)->num%2==0);
		
		System.out.println();
		System.out.println("Print numbers greater than 3:");
		eval(alist, (num)->num>3);

	}

}
