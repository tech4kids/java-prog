/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package removearrayvalues;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class RemoveArrayValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int quantofnumbers;
        int loop;
        int rand;
        int numbers[];
        int newNumbers[];
        int intRemove;
        int newNumbersPos=0;
        int newNumbersQuant=0;
                
        Scanner user_input = new Scanner(System.in);
        Random randint = new Random();
        
        System.out.println("State amount of numbers in array");
        quantofnumbers = user_input.nextInt();
        
        
        numbers = new int [quantofnumbers];
        for(loop=1;loop<=quantofnumbers; loop++ ){
            rand = randint.nextInt(6);
            numbers[loop-1]=rand;
        }
        System.out.println("Your original array: " +Arrays.toString(numbers));
        
        System.out.println("State number to be removed");
        intRemove = user_input.nextInt();
        
        for(loop=0; loop < quantofnumbers;loop++ ){
            if(numbers[loop]!= intRemove){
                newNumbersQuant++;
                
            }
        }
        newNumbers= new int [newNumbersQuant];
        for(loop=0; loop < quantofnumbers;loop++ ){
            if(numbers[loop]!= intRemove){
                newNumbers[newNumbersPos]= numbers[loop];
                newNumbersPos++;
            }
        }
        System.out.println("Removed "+ intRemove + " from array: " + Arrays.toString(newNumbers)+ " which is "+ newNumbers.length+ " integers long");
    }
}