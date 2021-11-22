/**
 * 
 */
package ca.bcit.comp1510.lab10;

/**
 * @author junsangyoo
 *
 */
public class RandomWalker {
    private int x;
    private int y;
    private int maxStep;
    private int steps;
    private int boundary;
    
    public RandomWalker(int maxStep, int boundary) {
        this.maxStep = maxStep;
        this.boundary = boundary;
        this.x = 0;
        this.y = 0;
        this.steps = 0;
    }
    
    public RandomWalker(int maxStep, int x, int y, int boundary) {
        this.maxStep = maxStep;
        this.x = x;
        this.y = y;
        this.boundary = boundary;
        this.steps = 0;
    }
    
    public String toString() {
        String str = "X: " + x + "\nY: " + y + "\nCurrent Steps: " + steps;
        return str;
    }
}
