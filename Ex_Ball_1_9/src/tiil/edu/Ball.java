package tiil.edu;

public class Ball {
	float x;
	float y;
	int radius;
	float xDelta;
	float yDelta;
	
	public Ball(float x,float y,int radius,float xDelta,float yDelta) {
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.xDelta = xDelta;
		this.yDelta = yDelta;
	}
	
	public float getX() {
		return x;
	}
	
	public void setX(float x) {
		this.x = x;
		return;
	}
	
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
		return;
	}
	
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
		return;
	}
	public float getXDelta() {
		return xDelta;
	}
	
	public void setXDelta(float xDelta) {
		this.xDelta = xDelta;
	}
	public float getYDelta() {
		return yDelta;
	}
	
	public void setYDelta(float yDelta) {
		this.yDelta = yDelta;
	}
	public void move() {
		x += xDelta;
		y += yDelta;
		return;
	}
	
	public void reflectHorizontal() {
		xDelta = -xDelta;
		return;
	}
	public void reflectVertical() {
		yDelta = -yDelta;
		return;
	}
	public String toString() {
		return String.format("Ball[(%.1f,%.1f), speed=(%.1f,%.1f)]", x,y,xDelta,yDelta);
	}
	
}
