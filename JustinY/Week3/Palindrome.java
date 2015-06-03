/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    
    public static boolean palindromeTest(char[] characters, int index){
        if(index>characters.length/2){
            return true;
        }
                
        if(characters[index]==characters[characters.length-1-index]){
            index++;
            return palindromeTest(characters, index);
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String string;
        System.out.println("State string:");
        Scanner input = new Scanner(System.in);
        string=input.nextLine();
        if(string.length()==0){
            System.out.println("String cannot just be empty!");
            return;
        }
        char[] characters=(string).toCharArray();
        if(palindromeTest(characters, 0)){
            System.out.println(string+" is a palindrome");
        }
        else{
            System.out.println(string+" is not a palindrome");
        }
    }
    
}
