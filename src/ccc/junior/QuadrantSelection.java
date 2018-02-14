/*
Justin Chang
Feb 13, 2018
1.0
Program 1
 */
package ccc.junior;

import java.util.Scanner;

/**
 *
 * @author justi
 */
public class QuadrantSelection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        int x, y;
        
        //Objects
        Scanner input = new Scanner (System.in);
        
        //Input
        x = input.nextInt();
        y = input.nextInt();
        
        //Processing
        if (x > 0 && y > 0){
            System.out.println("1");
        } else if (x > 0 && y < 0){
            System.out.println("4");
        } else if (x < 0 && y > 0){
            System.out.println("2");
        } else {
            System.out.println("3");
        }
        
    }
    
}
