//3)Create an ArrayList that can store only numbers like int,float,double,etc, but not any other data type.

package practice_questions_day7.com;

import java.util.*;
public class StoreSpecificDataType {

	public static void main(String[] args) {
		
		ArrayList<Number> list = new ArrayList<>();
		
		list.add(12);
		list.add(234.56f);
		list.add(23.456666);
		list.add(98);
		list.add(14.23);
		list.add(4.56f);
		
		Iterator<Number> it = list.iterator();
		
		System.out.println("The Numbers are --> ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
