package ca.bcit.comp1510.lab10;

/**
 * Creates two walkers and report the number of collisions of two walkers.
 * @author Jason(Junsang) Yoo
 * @version 2021
 *
 */
public class Collision {

    /**
     * Checks if two walkers passed the same position at the same time.
     * 
     * @param one first walker
     * @param two second walker
     * @return true if two walkers passed the same position at the same time
     *         false if two walkers never passed the same position at the 
     *                same time
     */
    public static boolean samePosition(RandomWalker one, RandomWalker two) {
        if (one.getX() == two.getX() && one.getY() == two.getY()) {
            return true;
        }
        return false;
    }
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        final int steps = 100000;
        final int boundary = 2000000;
        final int three = 3;
        final int nThree = -3;
        int collision = 0;
        RandomWalker walker1 = new RandomWalker(steps, nThree, 0, boundary);
        RandomWalker walker2 = new RandomWalker(steps, three, 0, boundary);
        
        for (int i = 0; i < steps; i++) {
            walker1.takeStep();
            walker2.takeStep();
            if (samePosition(walker1, walker2)) {
                collision++;
            }
            if (!walker1.inBounds() || !walker2.inBounds()) {
                break;
            }
        }
        
        System.out.println("Farthest distance of walker1: " 
                + walker1.getMaximumDistance() 
                + "\nFarthest distance of walker2: " 
                + walker2.getMaximumDistance()
                + "\nCollision: " + collision);

    }

}
