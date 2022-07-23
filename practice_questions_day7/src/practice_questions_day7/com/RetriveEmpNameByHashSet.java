 //2)Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using an Iterator.

package practice_questions_day7.com;

import java.util.*;
public class RetriveEmpNameByHashSet {

	public static void main(String[] args) {
		Set<String> ename = new HashSet<>();
		
		ename.add("Rahul Ranjan");
		ename.add("Vivek Gupta");
		ename.add("Rahul Ranjan");
		ename.add("Virat Kohli");
		ename.add("Sachin Kumar");
		
		Iterator<String> it = ename.iterator();
		
		System.out.println("Employee Names are --> ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
