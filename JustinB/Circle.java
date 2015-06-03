
class circle {
	double radius = 1;
	String color = "red";
	double area = radius*radius*3.14;
	void displayRadius()
	{
		System.out.println(radius);
	}
	void displayColor()
	{
		System.out.println(color);
	}
	void displayArea()
	{
		System.out.println(area);
	}
}


public class Application {

	public static void main(String[] args) {
		circle circle = new circle();
		
		circle.radius = 1;
		circle.displayRadius();
		//displays 1
		

	}

}
