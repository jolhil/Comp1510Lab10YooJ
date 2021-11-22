package ca.bcit.comp1510.lab10;

/**
 * 
 * @author Junsang(Jason) Yoo
 * @version 2021
 *
 */
public class Name implements Comparable<Name>{

    private String first;
    private String middle;
    private String last;
    
    public Name(String first,  String middle, String last) {
        if (first.trim().length() == 0 || last.trim().length() == 0) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
    
    public Name(final String first, final String last) {
        if (first.trim().length() == 0 || last.trim().length() == 0) {
            throw new IllegalArgumentException("Invalid name");
        }
        this.first = first;
        this.last = last;
    }
    
    public String getFirst() {
        return first;
    }
    
    public String getMiddle() {
        return middle;
    }
    
    public String getLast() {
        return last;
    }

    @Override
    public int compareTo(Name name2) {
        int result = this.last.compareTo(name2.getLast());
        if(result == 0) {
            result = this.first.compareTo(name2.getFirst());
        }
        if(result == 0) {
            result = this.middle.compareTo(name2.getMiddle());
        }
        return result;
    }
    
    public String toString() {
        String name = this.first + " " + this.middle + " " + this.last;
        return name;
    }
    
}
