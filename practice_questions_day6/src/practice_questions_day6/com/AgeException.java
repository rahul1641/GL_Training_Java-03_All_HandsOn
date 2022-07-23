package practice_questions_day6.com;

public class AgeException extends Exception {
	
	public AgeException() {
		System.out.println("Age Exception");
	}
	
	public AgeException(String s) {
		System.out.println("Age Exception "+s);
	}
}
