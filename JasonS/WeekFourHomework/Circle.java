public class Circle {
private double radius = 1;
private String color = "red";

Circle(double r, String c) {
r = radius;
c = color;
}

public double getRadius() {
return radius;
}

public double getArea() {
return radius * radius * 3.141592;
}

public String getColor() {
return color;
}
}