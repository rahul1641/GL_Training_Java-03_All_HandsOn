/*1)Write a Java program to create an ArrayList, add all the months of a year and print the same.

4) Implement the assignment 1 using Linked List.*/

package practice_questions_day7.com;

import java.util.*;
public class PrintMonthsUsingLinkedList {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		
		list.add("January");
		list.add("February");
		list.add("March");
		list.add("April");
		list.add("May");
		list.add("June");
		list.add("July");
		list.add("August");
		list.add("September");
		list.add("October");
		list.add("November");
		list.add("December");
		
		Iterator<String> it = list.iterator();
		
		System.out.println("The months are : ");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
}
