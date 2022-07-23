package practice_questions_day6.com;

public class InvalidCountryException extends Exception {
	
	public InvalidCountryException(){
		System.out.println("Invalid Country Exception");
	}
	
	public InvalidCountryException(String s) {
		System.out.println("Invalid Country Exception : "+s);
	}
}
