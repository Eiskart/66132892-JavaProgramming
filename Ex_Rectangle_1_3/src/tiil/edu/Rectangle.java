package tiil.edu;

public class Rectangle {
	float length;
	float width;
	
	public Rectangle(){
		length = 1.0f;
		width=1.0f;
	}
	
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	public float getLength() {
		return length;
	}
	public float getWidth() {
		return width;
	}
	public void setLength(float length) {
		this.length = length;
		return;	
	}
	public void setWidth(float width) {
		this.width = width;
		return;
	}
	
	
	public float getArea() {
		return (length*width);
	}
	
	public float getPerimeter() {
		return (length+width)*2;
	}
	
	public String toString() {
		return String.format("Hinh chu nhat co chieu dai la %.2f va chieu rong la %.2f", length, width);
	}
}
