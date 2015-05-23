/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lastwordlength;

import java.util.Scanner;

/**
 *
 * @author Justin
 */
public class LastWordLength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String inputSentence;
        String lastWord;
        System.out.println("Enter sentence:");
        Scanner input = new Scanner(System.in);
        inputSentence = input.nextLine();
        String words[]=inputSentence.split(" ");
        lastWord = words[words.length-1];
        if (words.length==1){
            System.out.println("0");
        }
        else{
            System.out.println(lastWord.length());   
        }
    }
    
}
