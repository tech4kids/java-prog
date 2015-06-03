package circle;

public class Circle {

    private double radius = 1.0;
    private String colorOfCircle = "red";
    Circle() {
    
    }
    Circle(double r, String color){
        radius = r;
        colorOfCircle = color;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return 3.14 * radius * radius;
    }
    public String getColor(){
        return colorOfCircle;
    }

}
