/*1)Develop a java class with a instance variable H1 (HashSet) add a method saveCountryNames(String CountryName) ,

the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).

Develop a method getCountry(String CountryName) which iterates through the HashSet and

returns the country if exist else return null.

NOTE: You can test the methods using a main method.*/


//4)Implement the assignment 1 using TreeSet
package practice_questions_day7.com;

import java.util.*;
public class GetCountryNameByTreeSet {
	

	Set<String> T1 = new TreeSet<>();
	
	public Set<String> saveCountryNames(String countryName) {
		T1.add(countryName);	
		return T1;
	}
	
	public void getCountryNames(){
		
		if(!(T1.isEmpty())) {
			Iterator<String> it = T1.iterator();
			
			System.out.println("Country Names are --> ");
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		else {
			System.out.println("null");
		}
	}
	public static void main(String[] args) {
		
GetCountryName g = new GetCountryName();
		
//		g.saveCountryNames("India");
//		g.saveCountryNames("Australia");
//		g.saveCountryNames("South Africa");
//		g.saveCountryNames("SriLanka");
		
		g.getCountryNames();
	}
}
