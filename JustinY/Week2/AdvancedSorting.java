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
       
        String a;
        String b;
        String c;
        int k;
        int j;
        int m;
        int o;
        int y;
        int x;
        Scanner user_input = new Scanner(System.in);
        System.out.println("State amount of numbers to be sorted");
        String i;
        i = user_input.next();

        int ii = Integer.parseInt(i);
        k=ii;
        int numbers[];
        numbers = new int [k];
 
        System.out.println("State 1st number");
        a = user_input.next();
        numbers[0] = Integer.parseInt(a);
        
        
        System.out.println("State 2nd number");
        b = user_input.next();
        numbers[1] = Integer.parseInt(b);
        
        
        System.out.println("State 3rd number");
        c = user_input.next();
        numbers[2] = Integer.parseInt(c);
        
        for (j=3; j<k;j++){
            m=j+1;
            o=j;
            String n;
            System.out.println("State "+m+ "th number");
            n = user_input.next();
            numbers[o] = Integer.parseInt(n); 
        }
        int f;
        int p = k-1;
        System.out.println("Original sequence");
        for(f=0; f<=p;f++){
            int g=numbers[f];
            System.out.println(g);
        }  
        int q=k-1;
        for(y=0; y<ii; y++){    
            for(x=0;x<q;x++){
                int z=x+1;
                if (numbers[x]>numbers[z]){
                    int temp=numbers[x];
                    numbers[x]=numbers[z];
                    numbers[z]=temp;
                }  
            }    
        }

        System.out.println("Numbers sequenced in order: ");
        for(f=0; f<=p;f++){
            int g=numbers[f];
            System.out.println(g);
        }        
    }
}