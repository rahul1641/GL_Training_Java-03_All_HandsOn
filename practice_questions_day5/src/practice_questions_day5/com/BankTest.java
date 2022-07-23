/*Q.4.)
 Create a class called GeneralBank that acts as base class for all banks. This class has getSavingsInterestRate and
getFixedDepositInterestRate methods, which returns the savings account interest rate and fixed deposit account interest rate
that the specific bank gives. Since GeneralBank cannot say what percentage which bank would give, make these methods abstract.
Create two subclasses of GeneralBank called ICICIBank and KotMBank. Override the inherited methods from the base class.
The following are the interest rates of these banks.
ICICIBank - Savings 4% Fixed 8.5% and
KotMBank - Savings 6% Fixed 9%.
Create a main method to test the above classes and their methods. Try one by one and observe your findings
a) ICICIBank i=new ICICIBank();
b) KotMBank k=new KotMBank();
c) GeneralBank g=new KotMBank();
d) GeneralBank g=new ICICIBank();
 */

package practice_questions_day5.com;

abstract class GeneralBank{
	
	public abstract void getSavingsInterestRate();
	public abstract void getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank{
	
	public void getSavingsInterestRate() {
		System.out.println();
		System.out.println("*****ICICI BANK*****");
		System.out.println("Saving Interest is = 4%");
	}
	
	public void getFixedDepositInterestRate() {
		System.out.println("Fixed Deposit Interest is = 8.5%");
		System.out.println();
	}
}

class KotMBank extends GeneralBank{
	
	public void getSavingsInterestRate() {
		System.out.println();
		System.out.println("*****KOTAK MAHINDRA BANK*****");
		System.out.println("Saving Interest is = 6%");
	}
	
	public void getFixedDepositInterestRate() {
		System.out.println("Fixed Deposit Interest is = 9%");
		System.out.println();
	}
}

public class BankTest {

	public static void main(String[] args) {
		
		 ICICIBank i = new ICICIBank();
		 KotMBank k = new KotMBank();
		 GeneralBank gk = new KotMBank();
		 GeneralBank gi = new ICICIBank();
		 
		 i.getSavingsInterestRate();
		 i.getFixedDepositInterestRate();
		 
		 k.getSavingsInterestRate();
		 k.getFixedDepositInterestRate();
		 
		 gk.getSavingsInterestRate();
		 gk.getFixedDepositInterestRate();
		 
		 gi.getSavingsInterestRate();
		 gi.getFixedDepositInterestRate();
	}
}
