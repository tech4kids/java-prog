/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circles;

/**
 *
 * @author Justin
 */
public class PrintCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circle circ = new Circle();
        System.out.println("The default values of the color, radius and area are: "+circ.getColor()+", "+circ.getRadius()+" and "+ circ.getArea());
        Circle othercirc= new Circle(1.0,"Red");
        othercirc.setRadius(10);
        othercirc.setColor("Green");
        System.out.println("The set values of the color, radius and area are: "+othercirc.getColor()+", "+othercirc.getRadius()+" and "+ othercirc.getArea());
    }   
    
}
