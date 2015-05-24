package homework4;
class Circle {
	private String color;
	private int radius;
	public Circle() {
	// Circle's color and radius
	color = "red";
	radius = 1;
	}
	public Circle(int r, String c){
		radius = r;
		color = c;
	}
	// getRadius, getArea, and getColor methods
	public int getRadius(){
		return radius;
	}
	public double getArea(){
		double area = radius*radius*3.1416;
		return area;
	}
	public String getColor(){
		return color;
	}
}
public class CircleTest {
	public static void main(String[] args) {
		Circle circle1 = new Circle(3, "grey");
		//System.out.println("Circle color is " + circle1.color);
		System.out.println("Circle radius is " + circle1.getRadius());
		System.out.println("Circle area is " + circle1.getArea());
		System.out.println("Circle color is " + circle1.getColor());
	}
}