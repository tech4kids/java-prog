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
public class BouncingBall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ball ball = new Ball(50,50,5,20,30);
        Container box = new Container(0,0,100,100);
        for (int step = 0; step<100; step++){
            ball.move();
            box.collidesWith(ball);
            System.out.println(ball.toString());
        }
        
    }
    
}
