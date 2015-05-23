package week.pkg3.assignment.optional;
import java.util.Scanner;
public class Week3AssignmentOptional {
    public static int calcFact(int numToCalc) { 
        if (numToCalc == 1) 
            return 1; 
        return numToCalc * calcFact(numToCalc - 1); 
    }
    public static boolean palindrome(String word) {
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length() - 1);
        if(word.length() == 1)
            return true;
        if(firstLetter != lastLetter)
            return false;
        else
            return palindrome(word.substring(1, word.length() - 1));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        String inputTwo;
        System.out.println("Enter a number to have its factorial calculated:");
        input = in.nextInt();
        in.nextLine();
        System.out.println("The factorial of your number is " + calcFact(input) + ".");
        System.out.println("Enter a word to see if it is a palindrome:");
        inputTwo = in.nextLine();
        if(palindrome(inputTwo) == true)
            System.out.println("Your word is a palindrome.");
        else System.out.println("Your word is not a palindrome.");
    }
    
}
