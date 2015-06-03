/**
 * Bouncing Balls (two classes:Ball and Container)
 * @author Russell
 */

public class Ball {
	private int x;
	private int y;
	private int radius;
	private double xDelta;
	private double yDelta;
	
	public Ball(int x, int y, int radius, int speed, int direction){
		this.x = x;
		this.y = y;
		this.radius = radius;
		xDelta = speed*Math.cos(direction);
		yDelta = -speed*Math.sin(direction);
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getRadius() {
		return radius;
	}
	public double getXDelta() {
		return xDelta;
	}
	public double getYDelta() {
		return yDelta;
	}
	
	public void move() {
		x += xDelta;
		y += yDelta;
	}
	public void reflectHorizontal() {
		xDelta = -xDelta;
	}
	public void reflectVertical() {
		yDelta = -yDelta;
	}
	public String toString() {
		return "Ball at (" + x + "," + y + ") with velocity (" + String.format("%.2f", xDelta) + "," + String.format("%.2f",yDelta) + ")";
}
	
public static class Container {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	public Container (int x1, int y1, int width, int height) {
		x2 = x1 + width - 1;
		y2 = y1 - height + 1;
	}
	public String toString() {
		return "Container at (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 +")"; 
	}
	public boolean collidesWith(Ball ball) {
		if (ball.getX() - ball.getRadius() <= this.x1 || ball.getX() - ball.getRadius() >= this.x2) {
			ball.reflectHorizontal();
			return true;
		       }
		else if (ball.getY() - ball.getRadius() <= this.y1 || ball.getY() - ball.getRadius() >= this.y2) {
			ball.reflectVertical();
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Ball ball = new Ball(50, 50, 5, 10, 30);
		Container box = new Container(0, 0, 100, 100);
		for (int step = 0; step < 100; ++step) {
		   ball.move();
		   box.collidesWith(ball);
		   System.out.println(ball); 
		}
	}
}
}