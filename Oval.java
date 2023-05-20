package assignment.sec08;

public class Oval implements Shape {
	private int a;
	private int b;
	
	public Oval(int a, int b ) {
		this.a = a;
		this.b = b;
	}

	@Override
	public void draw() {
		System.out.println("Oval with " + this.a + "x" + this.b);
		
	}

	@Override
	public double getArea() {
		return this.a * this.b * PI;
	}
	
}
