package week4;

public class PrintCircle {

	public static <sysout> void main(String[] args) {
		Circle CircleDefault = new Circle();
		Circle CircleCustomize = new Circle(10,"Blue");
		System.out.println("The default circles radius is " + CircleDefault.getRadius()+", its color is "+CircleDefault.getColor()+", and its area is "+CircleDefault.getArea()+".");
		System.out.println("The customized circles radius is "+CircleCustomize.getRadius()+", its color is "+CircleCustomize.getColor()+", and its area is "+CircleCustomize.getArea()+".");
	}

}
