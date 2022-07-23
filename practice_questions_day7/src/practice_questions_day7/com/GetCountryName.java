/*1)Develop a java class with a instance variable H1 (HashSet) add a method saveCountryNames(String CountryName) ,

the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).

Develop a method getCountry(String CountryName) which iterates through the HashSet and

returns the country if exist else return null.

NOTE: You can test the methods using a main method.*/

package practice_questions_day7.com;

import java.util.*;
public class GetCountryName {
	
	Set<String> H1 = new HashSet<>();
	
	public void saveCountryNames(String countryName) {
		H1.add(countryName);	
	}
	
	public void getCountryNames(){
		
		if(!(H1.isEmpty())) {
			Iterator<String> it = H1.iterator();
			
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
		
		g.saveCountryNames("India");
		g.saveCountryNames("Australia");
		g.saveCountryNames("South Africa");
		g.saveCountryNames("India");
		g.saveCountryNames("SriLanka");
		
		g.getCountryNames();

	}
}
