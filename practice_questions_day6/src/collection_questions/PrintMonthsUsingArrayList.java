//1)Write a Java program to create an ArrayList, add all the months of a year and print the same.

package collection_questions;

import java.util.*;
public class PrintMonthsUsingArrayList {

	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<>();
		
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
		
		Iterator<Object> it = list.iterator();
		
		System.out.println("The months are : ");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}

	}
}
