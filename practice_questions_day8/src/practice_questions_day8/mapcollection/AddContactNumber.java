/*3) Create a Collection “ContactList” using HashMap to store name and phone number of contacts added.

The program should use appropriate generics (String, Integer) and have the following abilities:

a) Check if a particular key exists or not.

b) Check if a particular value exists or not.

c) Use Iterator ccto loop through the map.*/

package practice_questions_day8.mapcollection;

import java.util.*;
public class AddContactNumber {

	public static void main(String[] args) {
		
		Map<String, Integer> contactList = new HashMap<>();
		
		contactList.put("Rahul Ranjan",834057164);
		contactList.put("Vivek Gupta", 918723452);
		contactList.put("Saurav Sekhar", 654329867);
		
		Iterator<Map.Entry<String, Integer>> itr = contactList.entrySet().iterator();
		
		boolean keyFlag = false;
		System.out.println("Check key(Name) is found or not ? ");
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			
			if(entry.getKey().equals("Rahul Ranjan")) {
				System.out.println(entry.getKey()+" name found as a key in the Hashmap");
				keyFlag = true;
				break;
			}
		}
		
		if(!keyFlag) {
			System.out.println("Key not found");
		}
		
		boolean valueFlag = false;
		System.out.println();
		System.out.println("Check value(Contact No.) is found or not ? ");
		while(itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			
			if(entry.getValue().equals(234567234)) {
				System.out.println(entry.getValue()+" contact value found in map");
				valueFlag = true;
				break;
			}
		}
		
		if(!valueFlag) {
			System.out.println("Map Value(Contact No.) not exists");
		}
		
		System.out.println();
		System.out.println("Itterating the map --> ");
		
		Iterator<Map.Entry<String, Integer>> itr1 = contactList.entrySet().iterator();
		while(itr1.hasNext()) {
			Map.Entry<String, Integer> entry1 = itr1.next();
			
			System.out.println("Name = "+entry1.getKey()+" , "+"Contact No. = "+entry1.getValue());
		}
	}
}
