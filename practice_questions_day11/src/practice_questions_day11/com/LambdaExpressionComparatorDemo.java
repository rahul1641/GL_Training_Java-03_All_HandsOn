/*2)

Write a program in java for LambdaExpressionComparator demo. The filter will sort the list of electronic products based on product name

Step1: Create a Product bean class with attributes id, name and price

Step2: create a main method and inside main method create the Product objects and products to the product list

Step3: Using the Collections. Sort , sort the Product List using lambda expression. Lambda expression will use the object compareTo method compare the name objects for sorting

Step4: Finally print the elements of sorted product list

Sample output

Sorting on the basis of name...

2 Dell Mouse 150.0

1 HP Laptop 25000.0

3 Keyboard 300.0*/

package practice_questions_day11.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{ 
	
    int id;  
    String name;  
    float price;  
    
    public Product(int id, String name, float price) {  
    	super();
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  

}

public class LambdaExpressionComparatorDemo {

	public static void main(String[] args) {
		
		Product p1 = new Product(1, "HP Laptop", 25000.0f);
		Product p2 = new Product(2, "Dell Mouse", 150.0f);
		Product p3 = new Product(3, "Keyboard", 300.0f);
		
		List<Product> pList = new ArrayList<>();  
		
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
        Collections.sort(pList,(a1,a2)->{  
        return a1.name.compareTo(a2.name);  
        });  
        
        System.out.println("Sorting on the basis of name...");
        for(Product p:pList){  
            System.out.println(p.id+" "+p.name+" "+p.price);  
        }  
    }  

}
