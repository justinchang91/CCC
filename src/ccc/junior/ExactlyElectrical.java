/*
Program 3
 */
package ccc.junior;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author justi
 */
public class ExactlyElectrical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // street = y, avenue = x
        // Variables
        String start, end;
        int charge, startX, startY, endX, endY, xDistance, yDistance, totalDistance, remain;

        // Objects
        Scanner input = new Scanner(System.in);

        //Input
        start = input.nextLine();
        end = input.nextLine();
        charge = input.nextInt();

        
        // Processing
        StringTokenizer st = new StringTokenizer (start, " ");
        startX = Integer.parseInt(st.nextToken());
        startY = Integer.parseInt(st.nextToken());
        
        StringTokenizer en = new StringTokenizer (end, " ");
        endX = Integer.parseInt(en.nextToken());
        endY = Integer.parseInt(en.nextToken());

        xDistance = endX - startX;
        yDistance = endY - startY;

        totalDistance = xDistance + yDistance;

        if (totalDistance == charge) {
            System.out.println("Y");
        } else if (totalDistance < charge) {
            remain = (charge - totalDistance) % 2;
            if (remain == 0) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }

        } else {
            System.out.println("N");
        }

    }

}
