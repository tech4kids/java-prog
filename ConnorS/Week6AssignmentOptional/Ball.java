package ball;

public class Ball {
    private int x;
    private int y;
    private int radius;
    private double deltaX;
    private double deltaY;
    public Ball(int x, int y, int radius, int speed, int direction){
        this.x = x;
        this.y = y;
        this.radius = radius;
        deltaX = speed * Math.cos(direction);
        deltaY = -speed * Math.sin(direction);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getRadius(){
        return radius;
    }
    public double getDeltaX(){
        return deltaX;
    }
    public double getDeltaY(){
        return deltaY;
    }
    public void move(){
        x += deltaX;
        y += deltaY;
    }
    public void reflectHorizontal(){
        deltaX = -deltaX;
    }
    public void reflectVertical(){
        deltaY = -deltaY;
    }
    @Override
    public String toString(){
        return "The ball is at (" + x + ", " + y + ") of velocity (" + deltaX + ", " + deltaY + ").";
    }
}
