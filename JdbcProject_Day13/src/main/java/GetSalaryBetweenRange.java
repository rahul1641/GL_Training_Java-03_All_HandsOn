
/*1) Write a java program that connects to oracle database, queries the inbuilt table “emp” and

displays the first two columns (empno using column index and ename using column name ) of all the rows.*/


//2) Modify the above program to display all the rows where sal is greater than 1000 and less than 2000.

// Display the columns ename, job, sal and comm.


//Q.2.)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetSalaryBetweenRange {

	public static void main(String[] args) throws Exception {
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");
		 
		 Statement st=con1.createStatement();
		 String query = "select ename,job,sal,comm from emp where sal > 1000 and sal < 2000";
		 
		 ResultSet rs = st.executeQuery(query);
		 
		 System.out.println("Salary in between 1000 and 2000 are --->");
		 System.out.println();
		 
		 String s1 = "Employee Name";
		 String s2 = "Job";
		 String s3 = "Salary";
		 String s4 = "Commission";
		 System.out.format("%15s %14s %18s %20s\n",s1,s2,s3,s4);
		 
		 while(rs.next()) {
			 
			 String name = rs.getString("ename");
			 String job = rs.getString("job");
			 float salary = rs.getFloat("sal");
			 float commission = rs.getFloat("comm");
			 
			 System.out.format("%15s  %15s  %15s  %15s\n",name,job,salary,commission);
		 }
		 st.close();
	}

}
