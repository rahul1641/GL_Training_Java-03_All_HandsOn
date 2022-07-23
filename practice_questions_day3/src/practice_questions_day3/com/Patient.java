//Q.3.)Design a class that can be used by a health care professional to keep track of a patient’s vital statistics. The following are the details.
//Name of the class - Patient
//Member Variables - patientName(String),height(double),weight(double)
//Member Function - double computeBMI()
//The above method should compute the BMI and return the result. The formula for computation of BMI is weight (in kg) ÷ height*height(in metres).
//Create an object of the Patient class and check the results.

package practice_questions_day3.com;

public class Patient {
	
	String patientName;
	double height;
	double weight;
	
	public Patient(String patientName, double height, double weight) {
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}

	double computeBMI() {
		return (weight/(height*height));
	}
	
	void PatientDetails() {
		System.out.println("Pateint Name = "+patientName);
		System.out.println("Pateint Weight = "+weight+" kg");
		System.out.println("Patient height = "+height+" m");
	}

	public static void main(String[] args) {
		
		Patient p = new Patient("Rahul Ranjan",1.83,65.5);
		
		p.PatientDetails();
		double bmi = p.computeBMI();
		System.out.println("BMI value of patient is = "+bmi+" kg/m^2.");	
	}
}
