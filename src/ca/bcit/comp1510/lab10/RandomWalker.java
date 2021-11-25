package ca.bcit.comp1510.lab10;

import java.util.Random;

/**
 * Represent the random walker concepts.
 * @author Junsang(Jason) Yoo
 * @version 2021
 */
public class RandomWalker {
    /** X coordinate.*/
    private int x;
    
    /** Y coordinate.*/
    private int y;
    
    /** Maximum number of steps.*/
    private int maxStep;
    
    /** Current number of steps.*/
    private int steps;
    
    /** Boundary of the square.*/
    private int boundary;
    
    /** Maximum distance.*/
    private int maximumDistance;
    
    /**
     * Constructor to set the maximum steps and boundary.
     * @param maxStep maximum steps as an integer
     * @param boundary boundary as an integer
     */
    public RandomWalker(int maxStep, int boundary) {
        this.maxStep = maxStep;
        this.boundary = boundary;
        x = 0;
        y = 0;
        steps = 0;
        maximumDistance = 0;
    }
    
    /**
     * Constructor to set the maximum steps, x coordinate, y coordinate, and 
     * boundary.
     * @param maxStep maximum steps as an integer
     * @param x X coordinate as an integer
     * @param y Y coordinate as an integer
     * @param boundary boundary as an integer
     */
    public RandomWalker(int maxStep, int x, int y, int boundary) {
        this.maxStep = maxStep;
        this.x = x;
        this.y = y;
        this.boundary = boundary;
        steps = 0;
        maximumDistance = 0;
    }
    
    /**
     * Simulate taking a single step.
     */
    public void takeStep() {
        final int max = 4;
        final int three = 3;
        Random generator = new Random();
        int num = generator.nextInt(max);
        switch (num) {
            case 0:
                y++;
                steps++;
                break;
                
            case 1:
                x++;
                steps++;
                break;
                
            case 2:
                x--;
                steps++;
                break;
                
            case three:
                y--;
                steps++;
                break;
            
            default:
                throw new IllegalArgumentException("Error");
        }
        
        maximumDistance = max(maximumDistance, max(x, y));
    }
    
    /**
     * Returns the maximum of a and b.
     * @param a an integer a
     * @param b an integer b
     * @return max the maximum of a and b
     */
    private int max(int a, int b) {
        int max = Math.max(Math.abs(a), Math.abs(b));
        return max;
    }
    
    /**
     * Returns the maximum distance.
     * @return maximumDistance maximum distance as an integer
     */
    public int getMaximumDistance() {
        return maximumDistance;
    }
    
    /**
     * Returns the x coordinate value.
     * @return x x coordinate
     */
    public int getX() {
        return x;
    }
    
    /**
     * Returns the y coordinate value.
     * @return y y coordinate
     */
    public int getY() {
        return y;
    }
    
    /**
     * Checks the current step is less than max step.
     * @return true if current step less than max step
     *         false if current step over the max step
     */
    public boolean moreSteps() {
        if (steps > maxStep) {
            return false;
        }
        return true;
    }
    
    /**
     * Checks if the walk is in the boundary.
     * @return true if the walker is in the boundary
     *         false if the walker is out of the boundary
     */
    public boolean inBounds() {
        if (Math.abs(x) > boundary || Math.abs(y) > boundary) {
            return false;
        }
        return true;
    }
    
    /**
     * Simulates to take a step until it takes maximum number of steps or over
     * the boundary.
     */
    public void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
        }
    }
    
    /**
     * Print the x coordinate y coordinate and current steps as a string.
     * @return str as a string
     */
    public String toString() {
        String str = "X: " + x + "\nY: " + y + "\nCurrent Steps: " + steps;
        return str;
    }
}
