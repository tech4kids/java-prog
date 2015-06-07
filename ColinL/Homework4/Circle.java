package week4;

public class Circle {
	private double Radius;
	private String Color;

	public Circle() {
		Radius = 1;
		Color = "red";
	}

	public Circle(double radius, String color) {
		Radius = radius;
		Color = color;
	}

	public void setRadius(double radius) {
		Radius = radius;
	}

	public double getRadius() {
		return Radius;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getColor() {
		return Color;
	}

	private double calculateArea() {
		return Radius * Radius * Math.PI;
	}

	public double getArea() {
		return calculateArea();
	}

}
