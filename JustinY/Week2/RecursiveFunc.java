/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivefunc;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class RecursiveFunc {

    /**
     * @param args the command line arguments
     */
    public static int f(int x){
        if (x>=4){
            return x+f(x-1);
        }
        else {
            return 2*x;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner user_input = new Scanner(System.in);
        String a;
        int x;
        System.out.println("State number");
        a = user_input.next();
        x = Integer.parseInt(a);
        int b=f(x);
        System.out.println(b);
        
    }
    
}
