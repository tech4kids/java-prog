/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class Prime {

    public static boolean isPrime(int input){
        for(int i=2; i<=Math.sqrt(input); i++){
            if (input%i==0){
                return false;
            }
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int input;
        Scanner userInput = new Scanner(System.in);
        System.out.println("State input:");
        input=userInput.nextInt();
        if(isPrime(input)){
            System.out.println(input+ " is a prime number");
        }
        else{
            System.out.println(input+ " is not a prime number");
        }
    }
    
}
