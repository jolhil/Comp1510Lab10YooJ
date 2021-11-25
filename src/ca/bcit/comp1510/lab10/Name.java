package ca.bcit.comp1510.lab10;

/**
 * Represent name whit first, middle and last name and 
 * set the comparing method for sorting the name list.
 * @author Junsang(Jason) Yoo
 * @version 2021
 *
 */
public class Name implements Comparable<Name> {
    
    /** First name.*/
    private String first;
    
    /** Middle name.*/
    private String middle;
    
    /** Last name.*/
    private String last;
    
    /**
     * Constructor to set first, middle, and last name.
     * @param first first name as a string and final
     * @param middle middle name as a string and final
     * @param last last name as a string and final
     */
    public Name(final String first, final String middle, final String last) {
        if (first.trim().length() == 0 || last.trim().length() == 0) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
    
    /**
     * Constructor to set the first and last name.
     * @param first first name as a string and final
     * @param last last name as a string and final
     */
    public Name(final String first, final String last) {
        if (first.trim().length() == 0 || last.trim().length() == 0) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.first = first;
        this.last = last;
    }
    
    /**
     * Returns the first name.
     * @return first first name as a string
     */
    public String getFirst() {
        return first;
    }
    
    /**
     * Returns the middle name.
     * @return middle middle name as a string
     */
    public String getMiddle() {
        return middle;
    }
    
    /**
     * Returns the last name.
     * @return last last name as a string
     */
    public String getLast() {
        return last;
    }

    /**
     * Compare two name to sort a list of names.
     * @param name2 comparable name as a Name
     * @return result as an integer
     */
    public int compareTo(Name name2) {
        int result = this.last.compareTo(name2.getLast());
        if (result == 0) {
            result = this.first.compareTo(name2.getFirst());
        }
        if (result == 0) {
            result = this.middle.compareTo(name2.getMiddle());
        }
        return result;
    }
    
    /**
     * Prints the first, middle, and last name.
     * @return name full name as a string
     */
    public String toString() {
        String name = first + " " + middle + " " + last;
        return name;
    }
    
}
