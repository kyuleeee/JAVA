package assignment.sec08;

public class Circle implements Shape{
	private int number;
	public Circle(int num){
		this.number = num;
	}
	@Override
	public void draw() {
		System.out.println("Circle with radius " + this.number);
	}

	@Override
	public double getArea() {
		return this.number * this.number * PI;
	}



}
