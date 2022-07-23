/*2) Create an ArrayList that can store only Strings.

Create a printAll method that will print all the elements of the ArrayList using an Iterator.*/

package collection_questions;

import java.util.*;
public class StoreStringArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Ram");
		list.add("Mohan");
		list.add("Rahul");
		list.add("Vivek");
		list.add("Rohan");
		
		printAll(list);
	}	
	
	public static void printAll(List<String> list) {
		
		Iterator<String> it = list.iterator();
		
		System.out.println("The elements in the list are : ");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
}
