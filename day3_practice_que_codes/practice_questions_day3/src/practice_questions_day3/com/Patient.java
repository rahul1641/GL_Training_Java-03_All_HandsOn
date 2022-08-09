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
