/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findhammingweight;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class FindHammingWeight {

    /**
     * @param args the command line arguments
     */
    public static String toBinary(int input){
        String binary="";
        if(input==0){
            return "0";
        }
        while(input>0){
            binary+=input%2;
            input/=2;
        }
        return binary;
    }
    public static int countHam(String Binary){
        int counter =0;
        for(int index=0; index<Binary.length();index++){
            if (Binary.charAt(index)=='1'){
                counter++;
            }
        }
        return counter;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int input;
        Scanner in = new Scanner(System.in);
        System.out.println("State input number:");
        input=in.nextInt();
        int output = countHam(toBinary(input));
        System.out.println("The Hamming weight of the integer inputed is "+output);
        
        
    }
    
}
