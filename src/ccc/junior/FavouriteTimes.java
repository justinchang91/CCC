/*
Program 4
 */
package ccc.junior;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author justi
 */
public class FavouriteTimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        String time, hoursS, minsS;
        long duration;
        int minuteCounter, timeInt, hours, mins, diff1, diff2, diff3, arseq = 0;

        // Objects
        Scanner input = new Scanner(System.in);

        // Input
        duration = input.nextInt();

        // Processing
        minuteCounter = 1;
        time = "12:00";

        StringTokenizer st = new StringTokenizer(time, ":");
        hours = Integer.parseInt(st.nextToken());
        mins = Integer.parseInt(st.nextToken());

        while (minuteCounter <= duration) {
            minuteCounter++;
            if (hours < 12) {
                mins = mins + 1;
                if (mins == 60) {
                    hours = hours + 1;
                    mins = 0;
                }
            } else {
                mins = mins + 1;
                if (mins == 60) {
                    hours = 1;
                    mins = 0;
                }
            }

            // Convert int minutes and hours into string
            hoursS = Integer.toString(hours);
            minsS = Integer.toString(mins);

            // Find difference in numbers of time
            diff1 = (Integer.parseInt(Character.toString(hoursS.charAt(1)))) - (Integer.parseInt(Character.toString(hoursS.charAt(0))));
            diff2 = (Integer.parseInt(Character.toString(minsS.charAt(1)))) - (Integer.parseInt(Character.toString(minsS.charAt(0))));
            diff3 = (Integer.parseInt(Character.toString(minsS.charAt(0)))) - Integer.parseInt(Character.toString(hoursS.charAt(1)));

            if (diff1 == diff2 && diff1 == diff3) {
                arseq++;
            }
        }

        System.out.println(arseq);
    }

}
//Find difference between digits. If they are the same, its an arithmetic sequence
