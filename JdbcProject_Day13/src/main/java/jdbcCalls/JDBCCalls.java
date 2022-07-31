/*4.)Develop a jdbc program containing main method, which should instantiate a class called DAOClass, which should contain methods called insert, delete, modify and display. Description of what each of these methods are expected to do is given below. Necessary details required for executing these methods, are passed from command line argument. For e.g. If the name of the class containing the main method is JDBCCalls, then if you want to insert a record, you will execute this class as java JDBCCalls 1 101 “Ajit” “IV” “20-Nov-2001” 4000

Where 1 is the option for inserting the record and all other details are the values for the columns in each row of the student table. The structure of student table is given below. Similarly, for deleting a record, you have to execute the code as

java JDBCCalls 2 101

where 2 is the option for deleting a record and 101 is the rollno of the student, whose record has to be deleted.

For modifying a record, you will use

java JDBCCalls 3 101 4500, where 3 is the option for modifying a record and the 4500 is the new fee which needs to replace the old fee value.

For Displaying records, if the main class is executed as follows

java JDBCCalls 4 101

it should display only one record, that of the student with roll no. 101. 4 option is for displaying the record.

If the main class is executed as

java JDBCCalls 4 (without specifying the rollno.), it means that details of all the students should be displayed.*/

/* Table Schema :-

create table student(RollNo int(4) Primary Key, name varchar(20) not null, standard varchar(3) not null, Date_of_Birth Date, Fees double(9,2));
*/

package jdbcCalls;

import java.sql.SQLException;

public class JDBCCalls {

	public static void main(String[] args) throws SQLException {
		
		System.out.print("Enter your choice : ");
		int ch = Integer.parseInt(args[0]);
		System.out.print(ch+"\n");
		switch(ch) {
			
		case 1:
			
			int roll = Integer.parseInt(args[1]);
			String name = args[2];
			String std = args[3];
			String dob = args[4];
			double amt = Double.parseDouble(args[5]);
			
			if(DAOClass.insert(roll, name, std, dob, amt)) {
				System.out.println("Inserted one row");
			}
			
			else {
				System.out.println("Insertion not take place");
			}
			break;
			
		case 2:
			
			 roll = Integer.parseInt(args[1]);
			 
			 if(DAOClass.delete(roll)) {
				 System.out.println("Deleted one row");
			 }
			 else {
				 System.out.println("Deletion not take place");
			 }
			 break;
			 
		case 3:
			
			roll = Integer.parseInt(args[1]);
			amt = Double.parseDouble(args[2]);
			
			if(DAOClass.modify(roll, amt)) {
				System.out.println("Updated the record");
			}
			else {
				System.out.println("Updation not take place");
			}
			break;
			
		case 4 :
			
			roll = Integer.parseInt(args[1]);
			
			if(DAOClass.display(roll)) {
				System.out.println();
				System.out.println("Displayed records based on certain condition...");
			}
			else {
				System.out.println("Displaying of records not happened");
			}
			break;
			
		case 5:
			
			if(DAOClass.displayAll()) {
				System.out.println();
				System.out.println("All records displayed...");
			}
			else {
				System.out.println("Displaying of all records not take place");
			}
			break;
			
		default :
			System.out.println("Wrong Choice!!");
			break;
		}

	}

}
