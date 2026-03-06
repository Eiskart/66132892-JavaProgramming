package tiil.edu;

public class Circle {
	
	// thuoc tinh
	private double radius;
	private String color;
	
	
	//Constructor
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	public Circle( double radius) {
		this.radius = radius;
		this.color = "red";
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	//getter
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
	
	// Setter
	public void setRadius(double radius) {
		this.radius = radius;
		return;
	}
	
	public void setColor(String color) {
		this.color = color;
		return;
		
	}
	public String toString() {
		return "Circle co radius:"+radius+",co color:"+color;
	}
	
	
}
