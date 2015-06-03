/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;
import java.util.Scanner;
/**
 *
 * @author Justin
 */
public class Sorting {

    
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        
        
        String a;
        System.out.println("State 1st number");
        a = user_input.next();
        
        int aa = Integer.parseInt(a);
        
        String b;
        System.out.println("State 2nd number");
        b = user_input.next();
        
        int bb = Integer.parseInt(b);
        
        String c;
        System.out.println("State 3rd number");
        c = user_input.next();
        
        int cc = Integer.parseInt(c);
        
        String d;
        System.out.println("State 4th number");
        d = user_input.next();
        
        int dd = Integer.parseInt(d);
        
        String e;
        System.out.println("State 5th number");
        e = user_input.next();
        
        int ee = Integer.parseInt(e);
        
        int [] numbers = {aa,bb,cc,dd,ee};
        
        System.out.println("Original order: " + a+","+b+","+c+","+d+","+e);
    
        int y;
        int x;
        for(y=0; y<5; y++){    
            for(x=0;x<4;x++){
                int z=x+1;
                if (numbers[x]>numbers[z]){
                int temp=numbers[x];
                numbers[x]=numbers[z];
                numbers[z]=temp;
                }  
            }    
        }
        System.out.println("Numbers sequenced in order: ");
        int f;
        for(f=0; f<5;f++){
        int g=numbers[f];
        System.out.println(g);
        }        
                
                
        
    }
}