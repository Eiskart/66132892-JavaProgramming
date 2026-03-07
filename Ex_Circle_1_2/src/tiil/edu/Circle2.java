package tiil.edu;


public class Circle2 {
	private double radius;
	
	public Circle2() {
		radius = 1.0;
	}
	public Circle2(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
		return;
	}
	public double getArea() {
		return (radius*radius*Math.PI);
	}
	public double getCircumference() {
		return radius*2*Math.PI;
	}
	public String toString() {
		return String.format("Vong tron co ban kinh la %.2f", radius);
	}
	
}
