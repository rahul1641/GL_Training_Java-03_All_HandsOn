//Q.5.

package practice_questions_day3.com;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e = new Employee(420000.56,2012,"S1297K","Rahul Ranjan");
		
		System.out.println("****** Employee Details ******");
		System.out.println("Person Name : "+e.pName);
		System.out.println("Employee Annual Salary : "+e.annualSalary);
		System.out.println("Employee Year of Joining : "+e.yearOfJoining);
		System.out.println("Employee National Insurance Number : "+e.insuranceNo);
	}
}
