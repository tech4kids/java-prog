/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bouncingball;

/**
 *
 * @author Justin
 */
public class Container {
    public float x1;
    public float x2;
    public float y1;
    public float y2;

    public Container(float x1, float y1, float height, float width) {
        x2=x1+width-1;
        y2=y1-height+1;
    }
    
    public String toString(float x1,float x2,float y1,float y2){
        return "Container at ("+x1+","+x2+") to ("+y1+","+y2+").";
    }
    
    public boolean collidesWith(Ball ball){
        if(ball.getX() - ball.getRadius() <= this.x1 || ball.getX() - ball.getRadius() >= this.x2){
            ball.reflectHorizontal();
            return true;
        }
        if(ball.getY() - ball.getRadius() <= this.y1 || ball.getY() - ball.getRadius() >= this.y2){
            ball.reflectVertical();
            return true;
        }
        return false;
    }
    
}

