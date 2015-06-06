class Circle{

	private double radius;
	private String color;
	
	public Circle(){
	radius = 1.0;
	color = "red";
	}
	
	public Circle(double r, String c){
	radius = r;
	color = c;
	}
	
	public double getRadius()	{
		return radius;
	}
	
	public String getColor()	{
		return color;
	}
	
	public double getArea()	{
		return radius*radius*3.14;
	}
	
}


	public class Print_circle{
		public static void main(String[] args) {
		
		Circle circle_print = new Circle(5.0,"blue");
		System.out.println("The radius is "+circle_print.getRadius());
		System.out.println("The color is "+circle_print.getColor());
		System.out.println("The area is "+circle_print.getArea());
	}
}	