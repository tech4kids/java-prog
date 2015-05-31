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
public class PrimeList {
    public static void listPrimes(int bound){
        int count=0;
        double countPercent;
        for(int i=2; i<bound; i++){
            if(testPrime(i)){
                System.out.println(i);
                count++;
            }
        }
        countPercent=(double)count/bound;
        Math.round(countPercent*100);
        countPercent*=100;
        System.out.println("[" +count+  " primes found (" + countPercent+ "%)]");
        
    }
    public static boolean testPrime(int i){
/*        if(Math.sqrt(i)%1==0){
            return false;
        }
        */
        if(i==4){
            return false;
        }
        for(int loop=2; loop<=Math.sqrt(i); loop++){
            if (i%loop==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int input;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter the upper bound:");
        input=userInput.nextInt();
        listPrimes(input);
    }
}
