import java.util.Scanner;

public class Week2HW          {  
	
	public static void main (String[] args){
        int x = 10;
		int y = 20;
		   
		   System.out.println("x="+x); 
		   System.out.println("y="+y); 
           

 /*Bonus Homework*/
 
 
		int a;
		int b;
		int c;
 
		Scanner jason = new Scanner(System.in);
		System.out.println("Enter an integer");
		a= jason.nextInt();
		System.out.println("Now enter another integer");
		b = jason.nextInt();
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
			c = b;
			b = a;
			a = c;
		
			System.out.println("a="+a);
			System.out.println("b="+b);
	}

 }