/*1) Write a java program that connects to oracle database, queries the inbuilt table “emp” and
displays the first two columns (empno using column index and ename using column name ) of all the rows.*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StoreTop2Record {

	public static void main(String[] args) throws Exception {
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");
		 
		 Statement st=con1.createStatement();
		 String query = "select empno,ename from emp";
		 
		 ResultSet rs = st.executeQuery(query);
		 
		 System.out.println("Top 2 records from employee table--->");
		 System.out.println();
		 
		 String s1 = "EmployeeID";
		 String s2 = "Employee Name";
		 System.out.format("%18s %18s\n",s1,s2);
		
		 while(rs.next()) {
			 
			 int id = rs.getInt("empno");
			 String name = rs.getString("ename");
			 	
			 	System.out.format("%15s %15s\n",id,name);
		 }
		 st.close();
	}

}
