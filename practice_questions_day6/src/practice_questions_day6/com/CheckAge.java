/*8)

Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60.

Display proper error messages.

The program must exit gracefully after displaying the error message in case the arguments passed are not proper.

 (Hint : Create a user defined exception class for handling errors.)*/

package practice_questions_day6.com;

public class CheckAge {
	
	public void disp(String name, int age) throws AgeException{
		
		if(age>=18 && age<60) {
			System.out.println("Name is : "+name);
			System.out.println(age+" is within the range");
		}
		else {
			throw new AgeException(" --> Age is not in the given range");
		}
	}

	public static void main(String[] args)throws Exception {
		
		System.out.println("Enter the name : "+args[0]);
		System.out.println("Enter the age : "+args[1]);
		
		CheckAge age = new CheckAge();
		age.disp(args[0],Integer.parseInt(args[1]));

	}
}