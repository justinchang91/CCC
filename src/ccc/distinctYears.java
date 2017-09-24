/*
Sept 24, 2017
Competition: 2013
State: Completed
http://www.cemc.uwaterloo.ca/contests/computing/2013/stage1/seniorEn.pdf



 */
package ccc;

import java.util.Scanner;

/**
 *
 * @author justi
 */
public class distinctYears {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objects 
        Scanner input = new Scanner(System.in);

        //Variables
        int year, year2, pos1, pos2, pos3, pos4;
        String k, posA, posB, posC, posD;
        boolean found = false;

        //Input
        year = input.nextInt();
        year2 = year;

        //Processing
        while (found == false) {

            year2 = year2 + 1;
            k = Integer.toString(year2);

            posA = k.substring(0, 1);
            pos1 = Integer.parseInt(posA);

            posB = k.substring(1, 2);
            pos2 = Integer.parseInt(posB);

            posC = k.substring(2, 3);
            pos3 = Integer.parseInt(posC);

            posD = k.substring(3, 4);
            pos4 = Integer.parseInt(posD);

            if (pos1 != pos2 && pos1 != pos3 && pos1 != pos4
                    && pos2 != pos1 && pos2 != pos3 && pos2 != pos4
                    && pos3 != pos1 && pos3 != pos2 && pos3 != pos4
                    && pos4 != pos1 && pos4 != pos2 && pos4 != pos3) {
                System.out.println(year2);
                found = true;
            } else {
                found = false;
            }
        }

    }

}
