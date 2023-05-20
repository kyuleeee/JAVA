package assignment.sec08;

public class Rect implements Angular, Shape {
	private int a;
	private int b; 
	
	public Rect(int a , int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public void printVertex() {
		System.out.println("Vertex: " + "("+ "-" + this.a/2 +","+"-"+ this.b/2 + ")" +
				"("+ this.a/2+ ","+"-"+  this.b/2 + ")" +
				"("+ "-" + this.a/2  + "," + this.b/2 + ")" +
				"("+ this.a/2 +  "," +this.b/2 + ")");
	}

	@Override
	public void draw() {
		System.out.println("Rectangle with " + this.a + "x" + this.b);
	}

	@Override
	public double getArea() {
		return this.a * this.b;
	}
	

}
