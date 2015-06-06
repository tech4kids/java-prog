package ball;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public Container(int xOfCorner, int yOfCorner, int width, int height){
        x1 = xOfCorner;
        y1 = yOfCorner;
        x2 = x1 + width;
        y2 = y1 + height;
    }
    @Override
    public String toString(){
        return "The container is at (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ").";
    }
    public boolean collidesWith(Ball ball) {
        if(ball.getX() - ball.getRadius() <= this.x1 || ball.getX() - ball.getRadius() >= this.x2) {
           ball.reflectHorizontal();
           return true;
        }
        else if(ball.getY() - ball.getRadius() <= this.y1 || ball.getY() - ball.getRadius() >= this.y2){
           ball.reflectVertical();
           return true;
        }
        else {
           return false;
        }
    }
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 30);
        Container box = new Container(0, 0, 100, 100);
        for (int step = 0; step < 100; ++step) {
            ball.move();
            box.collidesWith(ball);
            System.out.println(ball);
        }
    }
}
