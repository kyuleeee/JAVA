package assignment.sec08;

public class Line implements Angular {
	private int center; //on x-axis
	private int length;
	public Line(int a, int b) {
		this.center = a;
		this.length = b;
	}
	@Override
	public void printVertex() {
		 int start = this.center - (this.length / 2);
		 int end = this.center + (this.length / 2);
		 System.out.println("Vertex:" + "(" + start + ",0)"+  "(" + end + ",0)" );
	}

}
