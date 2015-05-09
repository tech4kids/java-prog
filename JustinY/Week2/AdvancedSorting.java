/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced.sorting;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Justin
 */
public class AdvancedSorting {

    
    public static void main(String[] args) {
       
        String Squantofnumbers;
        int loopvar;
        int temp;
        int sortvar;
        int loop;
        int quantofnumbers;
        int rand;
        
        Scanner user_input = new Scanner(System.in);
        Random randint = new Random();
        
        System.out.println("State amount of numbers to be sorted");
        Squantofnumbers = user_input.next();
        quantofnumbers = Integer.parseInt(Squantofnumbers);
        int numbers[];
        numbers = new int [quantofnumbers];
        for(loop=1;loop<=quantofnumbers; loop++ ){
            rand = randint.nextInt(21);
            numbers[loop-1]=rand;
        }
        System.out.println ("Numbers are: " + Arrays.toString(numbers));

        for(loopvar=0; loopvar<quantofnumbers; loopvar++){    
            for(sortvar=0;sortvar<quantofnumbers-1;sortvar++){
                if (numbers[sortvar]>numbers[sortvar+1]){
                    temp=numbers[sortvar];
                    numbers[sortvar]=numbers[sortvar+1];
                    numbers[sortvar+1]=temp;
                }  
            }    
        }
        System.out.println("Numbers sorted: " + Arrays.toString(numbers));    
    }
}