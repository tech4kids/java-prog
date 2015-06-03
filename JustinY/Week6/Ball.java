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
public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, float direction,float speed) {
        this.xDelta = (float) (speed * Math.cos(direction));
        this.yDelta = (float) (-speed * Math.sin(direction));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    
    public String toString(){
        return "Ball at ("+x+","+y+") at velocity of (Δ"+xDelta+" ,Δ"+yDelta+")";
    }
    public void move(){
        x+=xDelta;
        y+=yDelta;
    }
    public void reflectHorizontal(){
        xDelta*=-1;
    }
    public void reflectVertical(){
        yDelta*=-1;
    }
} 
