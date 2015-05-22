/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorials;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class Factorials {

    /**
     * @param args the command line arguments
     */
    
    public static int factorial(int n){
        if(n>1){
            return factorial(n-1)*n;
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int number;
        int ans;
        System.out.println("State number you want to factorial:");
        Scanner input = new Scanner(System.in);
        number=input.nextInt();
        ans = factorial(number);
        System.out.println("The factorial of " + number+ " is "+ans);
        
    }
    
}
