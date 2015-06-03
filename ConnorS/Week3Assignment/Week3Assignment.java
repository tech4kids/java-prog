package week.pkg3.assignment;
import java.util.Scanner;
public class Week3Assignment {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This program will determine how many letters are in the last word of a sentence you enter. Enter a sentence:");
        String userInput = in.nextLine();
        String lastWord = userInput.substring(userInput.lastIndexOf(" ")+1);
        System.out.println("The length of the last word in your sentence is " + lastWord.length() + " letters.");
    }
    
}
