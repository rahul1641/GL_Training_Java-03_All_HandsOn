/*1)Create a Collection called HashMap which is capable of storing String objects.

 The program should have the following abilities

a) Check if a particular key exists or not.

b) Check if a particular value exists or not.

c) Use Iterator to loop through the map.*/

package practice_questions_day8.mapcollection;

import java.util.*;
import java.util.Map.Entry;
public class StoreStringInHashMap {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("India","Rohit Sharma");
		map.put("Australia", "Pat Cummins");
		map.put("England", "Jos Buttler");
		map.put("South Africa", "Temba Bavuma");
		
		Set<Map.Entry<String, String>> ob = map.entrySet();
		Iterator<Entry<String, String>> it = ob.iterator();
		
		boolean keyFlag = false;
		System.out.println("Check key is found or not ? ");
		while(it.hasNext()) {
			Entry<String, String> entry = it.next();
			
			if(entry.getKey().equals("India")) {
				System.out.println("Key is found in the map");
				keyFlag = true;
				break;
			}
		}
		
		if(!keyFlag) {
			System.out.println("Key not found");
		}
		
		
		boolean valueFlag = false;
		System.out.println();
		System.out.println("Check value is found or not ? ");
		while(it.hasNext()) {
			Entry<String, String> entry = it.next();
			
			if(entry.getValue().equals("Virat Kohli")) {
				System.out.println("Value found in map");
				valueFlag = true;
				break;
			}
		}
		
		if(!valueFlag) {
			System.out.println("Map Value not exists");
		}
		
		System.out.println();
		System.out.println("Itterating the map --> ");
		
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			
			System.out.println("Key = "+entry.getKey()+" , "+"Value = "+entry.getValue());
		}
		
	}
}
