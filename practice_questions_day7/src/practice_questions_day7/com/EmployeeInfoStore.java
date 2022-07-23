/*6) Write a program that will have a Vector which is 
capable of storing Employee objects. Use an Iterator and enumeration to list all the elements of the Vector.*/

package practice_questions_day7.com;
import java.util.*;

class Employee{
	
	int eid;
	String ename;
	double salary;
	String role;
	
	public Employee(int eid, String ename, double salary, String role) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [Employee ID = " + eid + ", Employee Name= " + ename + ", Monthly Salary= " + salary + ", Desigination= " + role + "]";
	}
}
public class EmployeeInfoStore {

	public static void main(String[] args) {
		
		Vector<Employee> emp = new Vector<>();
		
		Employee e1 = new Employee(123,"Rahul Ranjan",35000.56,"Developer");
		Employee e2 = new Employee(276,"Vivek Gupta",23000.86,"Tester"); 
		Employee e3 = new Employee(223,"Rohan Mukherjee",45000.16,"Application Engineer");
		Employee e4 = new Employee(143,"Ram Kumar",42000.26,"Software Engineer");
		Employee e5 = new Employee(193,"Virat Kohli",56000.96,"Dev-ops");
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		
		Enumeration<Employee> e = emp.elements();
		
		System.out.println("*****************************Employees Details*******************************");
		System.out.println();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}
}
