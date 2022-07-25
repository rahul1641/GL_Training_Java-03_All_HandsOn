package practice_questions_day9.com;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	
	Employee e = new Employee();
	
	public static ArrayList<String> emp = new ArrayList<>();
		
		@BeforeAll
		public static void addEmployee() {
		emp.add("Rahul");
		emp.add("Vivek");
		emp.add("Ram");
		emp.add("Mohan");
		emp.add("Manish");
	  }
		

	@Test
	void testFindName() {
		//fail("Not yet implemented");
		String res = e.findName(emp, "Rahul");
		assertEquals(res,"FOUND");
		System.out.println("Passed test-1");
		
		String res1 = e.findName(emp, "Shyam");
		assertEquals(res1,"NOT FOUND");
		System.out.println("Passed test-2");
	}
	
}
