package week.pkg6.assignment;
import java.util.Scanner;
import static week.pkg6.assignment.Week6Assignment.isPrime;

public class PrimeList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an upperbound: ");
        int upperBound = in.nextInt();
        for(int i = 2; i <= upperBound; i++){
            if(isPrime(i) == true){
                System.out.println(i + " ");
            }
        }
    }
}
