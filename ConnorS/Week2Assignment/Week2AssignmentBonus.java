package week.pkg2.assignment.bonus;
import java.util.Scanner;
public class Week2AssignmentBonus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int y;
        int z;
        System.out.println("Enter an integer value for x:");  
        x = in.nextInt();
        System.out.println("Enter an integer value for y:");
        y = in.nextInt();
        System.out.println("Your value for x was "+x+". Your value for y was "+y+".");
        System.out.println("Your values will now be switched.");
        z=x;
        x=y;
        y=z;
        System.out.println("Your new value for x is now "+x+". Your new value for y is now "+y+".");
    }
    
}
