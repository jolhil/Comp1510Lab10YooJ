package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * Test the randomWalker class.
 * 
 * @author Junsang(Jason) Yoo
 * @version 2021
 */
public class TestWalker {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int ten = 10;
        final int five = 5;
        final int twoHundred = 200;
        RandomWalker walker1 = new RandomWalker(ten, five);
        for (int i = 0; i < five; i++) {
            walker1.takeStep();
        }
        
        
        System.out.println("What is the maximum steps of walker2?");
        int maxStep2 = scan.nextInt();
        System.out.println("What is the boundary size for walker2?");
        int boundary2 = scan.nextInt();
        RandomWalker walker2 = new RandomWalker(maxStep2, boundary2);
        for (int i = 0; i < five; i++) {
            walker2.takeStep();
        }

        
        System.out.println("Walker1 info: \n" + walker1 
                + "\nWalker2 info: \n" + walker2);
        
        RandomWalker walker3 = new RandomWalker(twoHundred, ten);
        
        System.out.println("Walker3 info: \n" + walker3);
        walker3.walk();
        System.out.println("\nNew Walker3 info: \n" + walker3);
        System.out.println("\nMaximum distance of walker3 is: " 
                + walker3.getMaximumDistance());
        scan.close();
    }

}
