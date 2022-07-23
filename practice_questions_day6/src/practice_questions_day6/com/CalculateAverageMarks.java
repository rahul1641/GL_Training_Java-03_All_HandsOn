/*6) Write a Program to take care of Number Format Exception if user enters values other than integer for 
calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken from the 
user while executing the program.In the same Program write your own Exception classes to take care of 
Negative values and values out of range (i.e. other than in the range of 0-100).*/

package practice_questions_day6.com;

import java.util.InputMismatchException;
import java.util.Scanner;
public class CalculateAverageMarks {

	public static void main(String[] args) throws ValuesOutOfRangeException, NegativeValueException{
		
		try {
			Scanner sc = new Scanner(System.in);
			int a1=0,b1=0,c1=0;
			int a2=0,b2=0,c2=0;
			
			System.out.println("Enter the name of 1st Student : ");
			String s1 = sc.next();
			System.out.println("Enter the name of 2nd Student : ");
			String s2 = sc.next();
				
				System.out.println();
				System.out.println("Enter the marks of Student 1 : ");
				System.out.println("Subject1 : ");
				a1=sc.nextInt();
				if(a1<0)
					throw new NegativeValueException();
				if(a1>100)
					throw new ValuesOutOfRangeException();
				
				System.out.println("Subject2 : ");
				b1=sc.nextInt();
				if(b1<0)
					throw new NegativeValueException();
				if(b1>100)
					throw new ValuesOutOfRangeException();
				
				System.out.println("Subject3 : ");
				c1=sc.nextInt();
				if(c1<0)
					throw new NegativeValueException();
				if(c1>100)
					throw new ValuesOutOfRangeException();
				System.out.println();
				
				System.out.println("Enter the marks of Student 2 : ");
				System.out.println("Subject1 : ");
				a2=sc.nextInt();
				if(a2<0)
					throw new NegativeValueException();
				if(a2>100)
					throw new ValuesOutOfRangeException();
				
				System.out.println("Subject2 : ");
				b2=sc.nextInt();
				if(b2<0)
					throw new NegativeValueException();
				if(b2>100)
					throw new ValuesOutOfRangeException();
				
				System.out.println("Subject3 : ");
				c2=sc.nextInt();
				if(c2<0)
					throw new NegativeValueException();
				if(c2>100)
					throw new ValuesOutOfRangeException();
				System.out.println();
				
				double avg1 = (double)(a1+b1+c1)/3;
				double avg2 = (double)(a2+b2+c2)/3;
				
				System.out.println("Average Marks of Student 1 is : "+avg1);
				System.out.println("Average Marks of Student 2 is : "+avg2);
				
			sc.close();
			}
		
		catch(NumberFormatException nfe) {
			System.out.println(nfe);
		}
		catch(InputMismatchException ime) {
			System.out.println(ime);
		}
		catch(NegativeValueException nve) {
			System.out.println(nve);
		}
		catch(ValuesOutOfRangeException vore) {
			System.out.println(vore);
		}

	}
}
