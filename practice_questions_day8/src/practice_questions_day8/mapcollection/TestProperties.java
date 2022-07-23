/*2) Write a program that will have a Properties class object which is capable of storing some States of India
and their Capital. Use an Iterator to list all the elements stored in the Properties.*/

package practice_questions_day8.mapcollection;

import java.util.*;
import java.util.Map.Entry;
public class TestProperties {

	public static void main(String[] args) {
		
		Properties p = new Properties();
		
		p.setProperty("Karnataka", "Bangaluru");
		p.setProperty("Jharkhand", "Ranchi");
		p.setProperty("Uttar Pradesh", "Lucknow");
		p.setProperty("West Bengal", "Kolkata");
		
		Set<Entry<Object, Object>> set = p.entrySet();
		Iterator<Entry<Object, Object>> itr = set.iterator();
		
		while(itr.hasNext()) {
			
			Entry<Object, Object> entry = itr.next();
			
			System.out.println("State= "+entry.getKey()+" , Capital= "+entry.getValue());
		}
		
	}
}
