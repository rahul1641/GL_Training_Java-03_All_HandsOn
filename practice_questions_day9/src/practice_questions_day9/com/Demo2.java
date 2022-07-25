/*3) i) Create the following class and implement the method to check whether the given

string is a palindrome and return the result.

Class Name : Demo2

Method : palindromeCheck(String):boolean

(Hint: A String is palindrome, If the reversed string is equal to the actual string.

 Ex: madam, mom, dad, malayalam )

ii) Create a Junit test class to test the above class.*/

package practice_questions_day9.com;

public class Demo2 {
	
	public static boolean palindromeCheck(String s) {
		
		String res = "";
		for(int i=s.length()-1;i>=0;i--) {
			res += s.charAt(i);
		}
		
		if(res.equals(s)) {
			return true;
		}
		
		else {
			return false;
		}
	}
}
