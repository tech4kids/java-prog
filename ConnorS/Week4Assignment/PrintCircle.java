package circle;

public class PrintCircle {

    public static void main(String[] args) {
        Circle circleOne = new Circle();
        System.out.println("The default radius is " + circleOne.getRadius() + ". The default area is " + circleOne.getArea() + ". The default color is " + circleOne.getColor() + ".");
        Circle circleTwo = new Circle(9, "purple");
        System.out.println("The new radius is " + circleTwo.getRadius() + ". The new area is " + circleTwo.getArea() + ". The new color is " + circleTwo.getColor() + ".");
    }
    
}
