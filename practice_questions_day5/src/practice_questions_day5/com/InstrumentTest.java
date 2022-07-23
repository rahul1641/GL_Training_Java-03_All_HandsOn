/*Q.6.)
  Create an abstract class Instrument which is having the abstract function play.
Create three more sub classes from Instrument which is Piano, Flute, Guitar. Override the play method inside all three classes printing a message

“Piano is playing tan tan tan tan ” for Piano class

“Flute is playing toot toot toot toot” for Flute class

“Guitar is playing tin tin tin ” for Guitar class

Create an array of 10 Instruments.

Assign different type of instrument to Instrument reference.

Check for the polymorphic behavior of play method.

Use the instanceof operator to print which object is stored at which index of instrument array.


 */

package practice_questions_day5.com;

abstract class Instrument{
	
	public abstract String play();
	
}

class Piano extends Instrument{
	
	public String play() {
		return "Piano is playing tan tan tan tan";
	}
}

class Flute extends Instrument{
	
	public String play() {
		return "Flute is playing toot toot toot toot";
	}
}

class Guitar extends Instrument{
	
	public String play() {
		return "Guitar is playing tin tin tin";
	}
}

public class InstrumentTest {

	public static void main(String[] args) {
		
		Piano p = new Piano();
		Flute f = new Flute();
		Guitar g = new Guitar();
		
		System.out.println(p.play());
		System.out.println(f.play());
		System.out.println(g.play());
		System.out.println();
		
		Instrument in;
		
			in = new Piano();
			System.out.println(in.play());
			in = new Flute();
			System.out.println(in.play());
			in = new Guitar();
			System.out.println(in.play());
		
			
			
		Instrument[] inst = new Instrument[10];
		
		inst[0] = new Piano();
		inst[1] = new Flute();
		inst[2] = new Guitar();
		inst[3] = new Flute();
		inst[4] = new Flute();
		inst[5] = new Guitar();
		inst[6] = new Guitar();
		inst[7] = new Piano();
		inst[8] = new Flute();
		inst[9] = new Piano();
		
		System.out.println();
		for(int i=0;i<inst.length;i++) {
			System.out.println("At index "+i+" "+inst[i].getClass().getSimpleName()+ " class object is stored.");
		}
	}
}