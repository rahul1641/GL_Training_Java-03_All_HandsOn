//Q.5.

package practice_questions_day3.com;

class Employee extends Person{
	
	double annualSalary;
	int yearOfJoining;
	String insuranceNo;
	
	public Employee(double annualSalary, int yearOfJoining, String insuranceNo,String eName) {
		super(eName);
		this.annualSalary = annualSalary;
		this.yearOfJoining = yearOfJoining;
		this.insuranceNo = insuranceNo;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}
	
	public String getInsuranceNo() {
		return insuranceNo;
	}
}