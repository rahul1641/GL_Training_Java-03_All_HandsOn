/*1) Create an application for employee management with the following classes:

a) Create an Employee class with following attributes and behaviors :

i) int empId

ii)String empName

iii)String email

iv)String gender

v)float salary

vi) void GetEmployeeDetails() -> prints employee details

b) Create one more class EmployeeDB with the following attributes and behaviors.

(i)ArrayList list;

ii) boolean addEmployee(Employee e) -> adds the employee object to the collection

iii) boolean deleteEmployee(int empId) ->delete the employee object from the collection with the given empid

iv) String showPaySlip(int empId) -> returns the payslip of the employee with the given empId

Provide implementation for all the methods and test your program*/


package practice_questions_day10.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
class Employee{
	
	int empId;
	String empName;
	String email;
	String gender;
	float salary;
	
	public Employee(int empId, String empName, String email, String gender, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}
		
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}


	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public float getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", email=" + email + ", gender=" + gender
				+ ", salary=" + salary + "]";
	}

	public void getEmployeeDetails() {
		System.out.println("Employee ID = " + empId + ", Employee Name = " + empName + ", Email Address = " + email + ", Gender = " + gender
				+ ",Employee Salary = " + salary);
		System.out.println();
	}
	
}

class EmployeeDB{
	
	public static ArrayList<Employee> list = new ArrayList<>();
	
	public boolean addEmployee(Employee e) {
		System.out.println("Employee Added in the list");
		return list.add(e);
	}
	
	public boolean deleteEmployee(int empId) {
		
		boolean flag = false;
		Iterator<Employee> itr = list.iterator();
		
		while(itr.hasNext()) {
			
			Employee e = itr.next();
			if(e.getEmpId() == empId) {
				itr.remove();
				System.out.println("Employee "+empId+ " Removed from the list");
				flag = true;
			}
		}
		return flag;
	}
	
	 public String showPaySlip(int empId) {
		 
		 String res ="Employee ID " +empId+ " not exists in the list can't show the Salaryslip !!";
		 Iterator<Employee> itr = list.iterator();
		 
		 while(itr.hasNext()) {
			 
			 Employee e = itr.next();
			 if(e.getEmpId() == empId) {
				 System.out.println("Employe ID = "+empId+", salary Details are as follows ----->");
				 res = e.toString();
			 }
		 }
		 return res;
	 }
	
}

public class TestEmployeeUsingArrayList {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(123,"Rahul Ranjan","rahul8340@gmail.com","Male",32000.4f);
		Employee e2 = new Employee(136,"Vivek Gupta","vivek76@gmail.com","Male",52000.4f);
		Employee e3 = new Employee(153,"Shweta Kumari","shweta43@gmail.com","Female",62000.4f);
		Employee e4 = new Employee(121,"Ram Prasad","ram9765@gmail.com","Male",72000.4f);
		Employee e5 = new Employee(190,"Geeta Kumari","geeta12@gmail.com","Female",42000.4f);
		
		System.out.println("*************************************Employee Details***************************************");
		System.out.println();
		e1.getEmployeeDetails();
		e2.getEmployeeDetails();
		e3.getEmployeeDetails();
		e4.getEmployeeDetails();
		e5.getEmployeeDetails();
		System.out.println();
		
		EmployeeDB empDB = new EmployeeDB();
		
		System.out.println("Employees are getting added...");
		empDB.addEmployee(e1);
		empDB.addEmployee(e2);
		empDB.addEmployee(e3);
		empDB.addEmployee(e4);
		empDB.addEmployee(e5);
		System.out.println();
		
		System.out.println("ArrayList will look like this after adding employees--->");
		Iterator<Employee> it = EmployeeDB.list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();

		boolean flag = empDB.deleteEmployee(136);
		if(flag) {
			System.out.println("Employees are getting removed...");
			empDB.deleteEmployee(136);
			System.out.println();
		}
		else {
			System.out.println("Incorrect Employee ID can't remove!!");
			System.out.println();
		}
		
		System.out.println("ArrayList will look like this if Employees are removed--->");
		Iterator<Employee> it1 = EmployeeDB.list.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println();
		
		String slip = empDB.showPaySlip(1);
		System.out.println(slip);
		System.out.println();
		
		String slip1 = empDB.showPaySlip(123);
		System.out.println(slip1);

	}

}
