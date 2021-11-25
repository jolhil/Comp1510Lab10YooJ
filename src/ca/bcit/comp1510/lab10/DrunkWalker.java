package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * Simulate the drunk walker.
 * @author Jason(Junsang) Yoo
 * @version 2021
 */
public class DrunkWalker {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the boundary?");
        int boundary = scan.nextInt();
        System.out.println("How many steps?");
        int steps = scan.nextInt();
        System.out.println("How many drunks to run?");
        int drunks = scan.nextInt();
        scan.close();

        int falls = 0;
        int tests = 0;
        
        for (int i = 0; i < drunks; i++) {
            RandomWalker walker1 = new RandomWalker(steps, boundary);
            walker1.walk();
            if (!walker1.inBounds()) {
                falls++;
            }
            tests++;
        }
        
        System.out.println("Total Test: " + tests
                + "\nTotal falls: " + falls);


    }

}
