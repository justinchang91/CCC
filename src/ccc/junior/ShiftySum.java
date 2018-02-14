/*
Problem 2
 */
package ccc.junior;

import java.util.Scanner;

/**
 *
 * @author justi
 */
public class ShiftySum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int n, k, sum = 0;
        
        //Objects
        Scanner input = new Scanner (System.in);
        
        //Input
        n = input.nextInt();
        k = input.nextInt();
        
        //Processing
        for (int i = 0; i <= k; i++){
            sum = sum + n;
            n = n*10;
            
        }
        
        //Output
        System.out.println(sum);
        
        
    }
    
}
