/*
Justin Chang
Feb 11, 2018
1.0
This program looks at sums
 */
package ccc;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author justi
 */
public class SumGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Constants
        //Variables
        int days, k = 0, runsSwift = 0, runsSema = 0;
        String runsBySwifts, runsBySema;
        int[] runsBySwiftsA, runsBySemaA;
        //Objects
        Scanner input = new Scanner (System.in);
        
        //Intro
        
        //Input
        System.out.print("Enter days: ");
        days = input.nextInt();
        
        System.out.print("Enter runs scored by swifts: ");
        runsBySwifts = input.next();
        input.nextLine();
        
        System.out.print("Enter runs scored by semaphores: ");
        runsBySema = input.next();
        
        //Processing
        runsBySwiftsA = new int[days];
        runsBySemaA = new int[days];
        
        StringTokenizer sw = new StringTokenizer(runsBySwifts, " ");
        for (int i = 0; sw.hasMoreTokens(); i++){
            runsBySwiftsA[i] = Integer.parseInt(sw.nextToken()) ; 
            System.out.println(runsBySwiftsA[i]);
        }
        
        
        
//        StringTokenizer se = new StringTokenizer(runsBySema, " ");
//        for (int j = 0; sw.hasMoreTokens(); j++){
//            runsBySemaA[j] = Integer.parseInt(se.nextToken()) ; 
//        }
//        
//        for (int b = 0; b <= days - 1; b++){
//            runsSwift = runsSwift + runsBySwiftsA[b];
//            runsSema = runsSema + runsBySemaA[b];
//            
//            if (runsSwift == runsSema){
//                k = b;
//            } 
//        }
//        
//        //Output
//        System.out.println(k);
    }
    
}
