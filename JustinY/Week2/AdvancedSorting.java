/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced.sorting;
import java.util.Scanner;
/**
 *
 * @author Justin
 */
public class AdvancedSorting {

    
    public static void main(String[] args) {
       
        String inputnumber;
        String Squantofnumbers;
        int loopvar;
        int temp;
        int sortvar;
        
        Scanner user_input = new Scanner(System.in);
        
        System.out.println("State amount of numbers to be sorted");
        Squantofnumbers = user_input.next();
        int quantofnumbers = Integer.parseInt(Squantofnumbers);
        int numbers[];
        numbers = new int [quantofnumbers];

        for (loopvar=0; loopvar<quantofnumbers;loopvar++){
            System.out.println("State number " + (loopvar+1));
            inputnumber = user_input.next();
            numbers[loopvar] = Integer.parseInt(inputnumber); 
        }
        System.out.println("Original sequence");
        for(loopvar=0; loopvar<quantofnumbers;loopvar++){
            System.out.println(numbers[loopvar]);
        }  
        for(loopvar=0; loopvar<quantofnumbers; loopvar++){    
            for(sortvar=0;sortvar<quantofnumbers-1;sortvar++){
                if (numbers[sortvar]>numbers[sortvar+1]){
                    temp=numbers[sortvar];
                    numbers[sortvar]=numbers[sortvar+1];
                    numbers[sortvar+1]=temp;
                }  
            }    
        }
        System.out.println("Numbers sequenced in order: ");
        for(loopvar=0; loopvar<=quantofnumbers-1;loopvar++){
            System.out.println(numbers[loopvar]);
        }        
    }
}