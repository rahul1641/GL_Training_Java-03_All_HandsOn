package practice_questions_day9.com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Demo1Test {

	@Test
	void testStringConcat() {
		
		String res = Demo1.stringConcat("Rahul", "Ranjan");
		assertEquals("Rahul Ranjan",res);
		
		String res1 = Demo1.stringConcat("Vivek", "Kumar");
		assertNotEquals("Vivek Gupta",res1);
		
	}

}
