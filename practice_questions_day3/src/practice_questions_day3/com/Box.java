//1.)Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box. 
//Create an object of the Box class and test the functionalities.

package practice_questions_day3.com;

public class Box {
	double width;
	double depth;
	double height;
	
	Box(){
		System.out.println("No-arg Constructor");
	}
	
	public Box(double width, double depth, double height) {
		super();
		this.width = width;
		this.depth = depth;
		this.height = height;
	}

	public double calculateVolume() {
		return width*depth*height;
	}
	
	public void display() {
		System.out.println("Width = "+width+" Depth = "+depth+" Height = "+height);
	}
	public static void main(String[] args) {
		Box b = new Box(20.5,4.5,3.5);
		
			b.display();
			double volume = b.calculateVolume();
			System.out.println("Volume of box is "+volume);
			
	}
}
