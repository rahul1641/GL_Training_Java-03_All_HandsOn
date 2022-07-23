/*1)Write a Java program to create an ArrayList, add all the months of a year and print the same.

5) Implement the assignment 1 using Vector*/

package practice_questions_day7.com;

import java.util.*;
public class PrintMonthsUsingVector {

	public static void main(String[] args) {
		
		Vector<String> vlist = new Vector<>();
		
		vlist.add("January");
		vlist.add("February");
		vlist.add("March");
		vlist.add("April");
		vlist.add("May");
		vlist.add("June");
		vlist.add("July");
		vlist.add("August");
		vlist.add("September");
		vlist.add("October");
		vlist.add("November");
		vlist.add("December");
		
		Enumeration<String> e = vlist.elements();
		
		System.out.println("The Months are --> ");
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}

	}

}
