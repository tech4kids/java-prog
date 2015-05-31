package week.pkg6.assignment;
import java.util.Scanner;
public class Week6Assignment {
    public static boolean isPrime(int posInt){
        for(int i = 2; i<= Math.sqrt(posInt); i++){
            if(posInt%i == 0){
                return false;
            }
        }
        return true;
    }
}
