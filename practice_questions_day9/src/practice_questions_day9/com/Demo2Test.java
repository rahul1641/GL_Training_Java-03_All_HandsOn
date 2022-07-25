package practice_questions_day9.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo2Test {

	@Test
	void testPalindromeCheck() {
		//fail("Not yet implemented");
		
		boolean b1 = Demo2.palindromeCheck("dad");
		assertEquals(b1,true);
		
		boolean b2 = Demo2.palindromeCheck("mom");
		assertEquals(b2,true);
		
		boolean b3 = Demo2.palindromeCheck("madam");
		assertEquals(b3,true);
		
		boolean b4 = Demo2.palindromeCheck("malayalam");
		assertEquals(b4,true);
		
		boolean b5 = Demo2.palindromeCheck("Rahul");
		assertEquals(b5,false);
		
	}

}
