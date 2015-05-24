/**
 * Use private instance variables, public methods and 2 constructors to print circle info
 * @author Russell
 */

class circle {
	private String color;
	private double radius;
	double area;
	
    public String getColor() {
		return color;
	}
	public double getRadius() {
		return radius;
	}
    public double getArea() {
		area = radius*radius*3.14;
		return area;
	}
    
    public circle(){
    	this("red", 1.0);
    }
    
    public circle (String color, double radius){
    	this.color=color;
    	this.radius=radius;
    	getArea();
    	System.out.println("The circle's color is "+ color + ", its radius is "+ radius +" and the area is "+ area);
	}
	
}

public class Circles {
	public static void main(String[] args) {
		circle defaultCircle = new circle();
        circle mycircle = new circle ("blue", 3.0);
	}
}
