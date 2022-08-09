package practice_questions_day3.com;

class Person1{
	
	String pName;
	String dob;
	
	public Person1(String pName, String dob) {
		super();
		this.pName = pName;
		this.dob = dob;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
}

class Teacher extends Person1{
	
	double salary;
	String subject;
	
	public Teacher(double salary, String subject, String tName, String dob) {
		super(tName,dob);
		this.salary = salary;
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}

class Student extends Person1{
	
	String studentId;

	public Student(String studentId, String sName, String dob) {
		super(sName, dob);
		this.studentId = studentId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
}

class CollegeStudent extends Student{
	
	String collegeName;
	int year;
	
	public CollegeStudent(String studentId, String sName, String dob, String collegeName, int year) {
		super(studentId, sName, dob);
		this.collegeName = collegeName;
		this.year = year;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}

public class Test {

	public static void main(String[] args) {
		
		Person1 p = new Person1("Shivam","23/04/1997");
		
		System.out.println("*****Person Details*****");
		System.out.println();
		System.out.println("Person Name : "+p.getpName());
		System.out.println("Person Date Of Birth : "+p.getDob());
		System.out.println();
		
		Teacher t = new Teacher(50000.45,"Mathematics","Amit Verma","01/01/1970");
		
		System.out.println("*****Teacher Details*****");
		System.out.println();
		System.out.println("Teacher Name : "+t.getpName());
		System.out.println("Teacher Date of Birth : "+t.getDob());
		System.out.println("Salary : "+t.getSalary());
		System.out.println("Subject : "+t.getSubject());
		System.out.println();
		
		Student s = new Student("S1234","Rahul Kumar","23/08/1999");
		
		System.out.println("*****Student Details*****");
		System.out.println();
		System.out.println("Student ID : "+s.getStudentId());
		System.out.println("Student Name : "+s.getpName());
		System.out.println("Student Date of Birth : "+s.getDob());
		System.out.println();
		
		CollegeStudent cs = new CollegeStudent("P6574","Vivek Kr. Gupta","23/03/2000","IIT Bombay",4);
		
		System.out.println("*****College Student Details*****");
		System.out.println();
		System.out.println("College Student ID : "+cs.getStudentId());
		System.out.println("College Student Name : "+cs.getpName());
		System.out.println("College Student Date Of Birth : "+cs.getDob());
		System.out.println("College Name : "+cs.getCollegeName());
		System.out.println("College Student Year : "+cs.getYear());
	}
}
