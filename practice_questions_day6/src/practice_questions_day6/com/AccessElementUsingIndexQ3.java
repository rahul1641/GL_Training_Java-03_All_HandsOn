/*3)

Write a program that takes as input the size of the array and the elements in the array. The program then asks the user to enter a particular index and prints the element at that index. Index starts from zero.

This program may generate Array Index Out Of Bounds Exception or NumberFormatException . Use exception handling mechanisms to handle this exception.

Sample Input and Output 1:

Enter the number of elements in the array

2

Enter the elements in the array

50

80

Enter the index of the array element you want to access

1

The array element at index 1 = 80

The array element successfully accessed

 Sample Input and Output 2:

Enter the number of elements in the array

2

Enter the elements in the array

50

80

Enter the index of the array element you want to access

9

java.lang.ArrayIndexOutOfBoundsException

 Sample Input and Output 3:

Enter the number of elements in the array

2

Enter the elements in the array

30

j

java.lang.NumberFormatException*/

package practice_questions_day6.com;

import java.util.InputMismatchException;
import java.util.Scanner;
public class AccessElementUsingIndexQ3 {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("Enter the number of elements in the array from command line : "+args[0]);
			
			System.out.println("Enter the elements in the array from command line : ");
			for(int i=1;i<=Integer.parseInt(args[0]);i++) {
				System.out.println(Integer.parseInt(args[i]));
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the index of thes array element you want to access : ");//from terminal or console
			int index = sc.nextInt();
			
			System.out.println("The array element at index "+index+" = "+args[index+1]);
			sc.close();
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}
		catch(NumberFormatException nfe) {
			System.out.println("Please Enter correct input elements in the array : "+nfe);
		}
		catch(InputMismatchException ime) {
			System.out.println(ime);
		}
	}
}
