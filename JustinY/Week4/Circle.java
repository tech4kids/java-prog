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
public class Circle {
    private double radius=1.0;
    private String color= "Red";
    
    
    Circle(){
        
    }
    Circle(double r, String c){
        radius = r;
        color=c;        
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return radius*radius*3.14159265;
    }
    
}
