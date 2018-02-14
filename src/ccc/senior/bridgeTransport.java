/*
Sept 25, 2017
Competition: 2013
State: incomplete
http://www.cemc.uwaterloo.ca/contests/computing/2013/stage1/seniorEn.pdf
 */
package ccc.senior;

import java.util.Scanner;

/**
 *
 * @author justi
 */
public class bridgeTransport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objects 
        Scanner input = new Scanner(System.in);

        //Variables
        int maxWeight, numCars, sum = 0, carsAllowed = 0, totalWeight;

        //Input
        maxWeight = input.nextInt();
        numCars = input.nextInt();

        int[] carWeight = new int[numCars]; // car weights

        for (int i = 0; i < carWeight.length; i++) { // Fill array
            carWeight[i] = input.nextInt();
        }

        //Processing
        int i = 3;
        totalWeight = carWeight[i-3] + carWeight[i-2] + carWeight[i-1] + carWeight[i];
        
        while (totalWeight <= maxWeight){
            carsAllowed = carsAllowed + 1;
            i = i + 1;
            totalWeight = carWeight[i-3] + carWeight[i-2] + carWeight[i-1] + carWeight[i];
            
                   
        }
            
            
        System.out.println(carsAllowed);
        
        
    }

}
