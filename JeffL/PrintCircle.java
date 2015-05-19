package Circle_p;

public class PrintCircle {

	
public static void main(String[] args) {
	
	
	Circle c=new Circle();
	System.out.println("the default radius is "+c.GetRadius());
	System.out.println("the default area is "+c.GetArea());
	System.out.println("the default color is "+c.GetColor());
	
	
	
	Circle s=new Circle(5.434, "blue");
	System.out.println("the new radius is "+s.GetRadius());
	System.out.println("the new area is "+s.GetArea());
	System.out.println("the default color is "+s.GetColor());
	}
}
