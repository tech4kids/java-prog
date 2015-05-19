package Circle_p;

public class Circle {

	 private double radius=1.0;
	 private String color="red";
	
	
	Circle(){}
	
	Circle(double r, String circlecolor){
		
		radius=r;
		
		color=circlecolor;
		
	}

	
 public double GetRadius(){
	 
	return radius; 
	 
 }
 
 public double GetArea(){
	 return 3.14*radius*radius;
 }
 
 public String GetColor(){
 return color;
 
 }
}



