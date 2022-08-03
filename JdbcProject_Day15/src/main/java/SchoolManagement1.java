/*1) Inserting a record

ABC International School wants to computerize students details. The school maintains a database of students in Oracle.

The student table contains information related to students and is shown in the following student table structure.

Column Name Type Constraint

Rollno Number (4) Primary Key

StudentName Varchar (20) Not Null

Standard Varchar (2) Not Null

Date_Of_Birth Date

Fees Number (9,2)

 When a new student joins the school, the student record is inserted in the student table.

The valid student details are as follows:

• Rollno: Valid value is a 4-digit number

• StudentName: Valid value can contain maximum 20 letters in uppercase

• Standard : Valid values are Roman Letters representing I to X(I, II, III, IV….IX, X)

Write a Java program to insert some records to the table

2) Deleting a Student’s record

When a student leaves the school, the record related to that student needs to be deleted from the Student table.

The student’s roll no, whose record has to be deleted, should be passed as a command line argument.

Upon deletion, the Student details must be stored in another table named StudentLog which will maintain the details

such as Rollno, StudentName, Standard and Leaving_date.

3) Modification of Student record

When there is a change in the fee to be paid by a student, the respective row should be appropriately updated.

Pass the rollno from the command prompt along with the new fee amount and this amount should be reflected in the table

 for that particular student.

4) Display Student details

Write the code to display details of all the students, if no roll no. is passed, while executing the main program.

If while executing the main program, the roll no. is passed, then it should display the record of that particular student.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolManagement1 {

	public static void main(String[] args) throws Exception{
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");
		 
		 Scanner sc = new Scanner(System.in);
		 
			 System.out.println("Pass 1 in command-line to insert a row...");
			 System.out.println("Pass 2 in command-line to delete a row...");
			 System.out.println("Pass 3 in command-line to modify fees of a row...");
			 System.out.println("Pass 4 in command-line to display detail based on passing a rollno...");
			 System.out.println("Pass any other key to display all details of table...");
			 System.out.println("---------------------X----------------------");
			 int ch = Integer.parseInt(args[0]);
			 System.out.println("Option "+ch+ " is selected...");
			 System.out.println();
			 switch(ch) {
		
				case 1:
					
				 int rollno = 0;
				 String roll;
				 boolean checkRoll;
				 
					 do {
						 System.out.print("Enter the Roll No. : ");
						 rollno = sc.nextInt();
					 
						 roll = String.valueOf(rollno);
					     checkRoll = false;
					     
						  if(roll.length()==4) {
							  rollno = Integer.parseInt(roll);
							  checkRoll = true;
						  }
						  else {
							  System.out.println("Not a 4 digit RollNo.");
							  checkRoll = false;
						  	}
					 }while(!checkRoll);
		  
				 String sName="";
				 boolean nameFlag;
				 sc.nextLine();		//buffer because string is taken user input after integer.
				 
				  	do {
						  
						  System.out.print("Enter the Name : ");
						  sName = sc.nextLine();
						  
						  nameFlag = false;
						  String name = sName.toUpperCase();
						  if(sName.equals(name) && sName.length()<=20) {
							  nameFlag = true;
						  }
						  else {
							  System.out.println("Please enter the name in upper case or length of name should be less than 20!!");
							  System.out.println();
							  nameFlag = false;
						  }
				  	}while(!nameFlag);

					  String std = "";
					  List<String> list = new ArrayList<String>();
					  
					  list.add("I");
					  list.add("II");
					  list.add("III");
					  list.add("IV");
					  list.add("V");
					  list.add("VI");
					  list.add("VII");
					  list.add("VIII");
					  list.add("IX");
					  list.add("X");
		  
					  boolean standard;
					  
					  do {
							System.out.print("Enter Standard of the Student : ");
							std = sc.nextLine();
							
							standard = false;
							if(list.contains(std)) {
								standard = true;
							}
							else {
								System.out.println("Standard Not exists in the List...Try Again!!");
								System.out.println();
								standard = false;
							}
						} while (!standard);
		   
					  System.out.print("Enter Date of Birth : ");
					  String dob = sc.nextLine();
		  
					  System.out.print("Enter fees of the student : ");
					  double fees = sc.nextDouble();
						
					String query = "insert into school values(?, ?, ?, ?, ?)";
					PreparedStatement ps=con.prepareStatement(query);
			
						ps.setInt(1, rollno);
						ps.setString(2, sName);
						ps.setString(3, std);
						ps.setString(4, dob);
						ps.setDouble(5, fees);
						
					ps.executeUpdate();
					System.out.println("Student registered successfully...");
					System.out.println();
					break;
					
				case 2:
					System.out.println("Enter the roll no of student which you want to delete : ");
					rollno = Integer.parseInt(args[1]);
					System.out.println(rollno);
					
					System.out.println("Enter leaving date of the student");
					String leavingDate = args[2];
					System.out.println(leavingDate);
					
					 Statement st=con.createStatement();
					 
				    query = "select rollno,studentname,standard from school where rollno=rollno";
				    ResultSet rs = st.executeQuery(query);
				    
				    String name = "";
				    String stand = "";
				    
				    while(rs.next()) {
				    	
				    	name = rs.getString("StudentName");
				    	stand = rs.getString("Standard");
				    }
				    
				  query = "insert into studentlog values (?, ?, ?, ?)";
				  ps = con.prepareStatement(query);
				  
				  ps.setInt(1, rollno);
				  ps.setString(2, name);
				  ps.setString(3, stand);
				  ps.setString(4, leavingDate);
				  int insert = ps.executeUpdate();
				  
				    
				    query = "delete from school where rollno=?";
					ps=con.prepareStatement(query);
				    
				    ps.setInt(1, rollno);
				    int del = ps.executeUpdate();
				    
				    if(insert == 1 && del == 1) {
				    	System.out.println("Record with Roll No. = "+rollno+" deleted and also stored in student log table");
				    }
				    else {
				    	System.out.println("Record not deleted or Record Not exist in the Table!!");
				    }
				    break;
				    
				case 3:
					System.out.println("Enter the roll no for which you want to modify fees : ");
					rollno = Integer.parseInt(args[1]);
					System.out.println(rollno);
					
					System.out.println("Enter the fees amount you want to update : ");
					double fee = sc.nextDouble();
					query = "update school set fees = ? where rollno = ?";
					ps=con.prepareStatement(query);
					
					ps.setDouble(1, fee);
					ps.setInt(2, rollno);
					int feeUpdate = ps.executeUpdate();
					
					if(feeUpdate == 1) {
						System.out.println("Fee Updated Successfully for Roll No. "+rollno);
					}
					else {
						System.out.println("RollNo. Not found or Fees Not Updated!!");
					}
					break;
					
				case 4:
					
					System.out.println("Enter the Roll No. for which you want to fetch the details : ");
					rollno = Integer.parseInt(args[1]);
					System.out.println(rollno);
					System.out.println();
					
					
					query = "select * from school where rollno=?";
					ps = con.prepareStatement(query);
					
					ps.setInt(1,rollno);
				    rs = ps.executeQuery();
					
					 while(rs.next()) {
						 rollno = rs.getInt("rollno");
						 name = rs.getString("studentname");
						 stand = rs.getString("standard");
						 dob = rs.getString("date_of_birth");
						 fee = rs.getDouble("fees");
						 
						 System.out.format("%2s %15s %15s %15s %15s\n",rollno,name,stand,dob,fee);
					 } 
					 System.out.println();
					 System.out.println("Particular Roll No. Details Displayed...");
					 break;
				    
				default:
					
					 st=con.createStatement();
					 query = "select * from school";
				
				 
					 rs = st.executeQuery(query);
					 while(rs.next()) {
						 rollno = rs.getInt("rollno");
						 name = rs.getString("studentname");
						 stand = rs.getString("standard");
						 dob = rs.getString("date_of_birth");
						 fee = rs.getDouble("fees");
						 
						 System.out.format("%2s %15s %15s %15s %15s\n",rollno,name,stand,dob,fee);
					 } 
					 System.out.println();
					 System.out.println("All records Displayed...");
					 break;
			 }	
			 
		}
	
	}

