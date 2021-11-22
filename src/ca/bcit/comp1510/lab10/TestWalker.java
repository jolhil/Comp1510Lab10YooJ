/**
 * 
 */
package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * @author junsangyoo
 *
 */
public class TestWalker {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int ten = 10;
        final int five = 5;
        RandomWalker walker1 = new RandomWalker(ten, five);
        
        System.out.println("What is the maximum steps of walker2?");
        int maxStep2 = scan.nextInt();
        System.out.println("What is the boundary size for walker2?");
        int boundary2 = scan.nextInt();
        RandomWalker walker2 = new RandomWalker(maxStep2, boundary2);
        
        System.out.println("Walker1 info: \n" + walker1 
                + "\nWalker2 info: \n" + walker2);

    }

}
