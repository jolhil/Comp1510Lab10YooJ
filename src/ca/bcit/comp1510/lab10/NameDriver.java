package ca.bcit.comp1510.lab10;

import java.util.ArrayList;

/**
 * Test the Name class and sorting its list.
 * @author Junsang(Jason) Yoo
 * @version 2021
 *
 */
public class NameDriver {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        ArrayList<Name> nameList = new ArrayList<Name>();
        Name name1 = new Name("Jason", "Yoo");
        Name name2 = new Name("John", "Unknown", "Doe");
        Name name3 = new Name("John", "", "Snow");
        Name name4 = new Name("Richard", "Ohata");
        Name name5 = new Name("John", "A", "Doe");
        
        nameList.add(name1);
        nameList.add(name2);
        nameList.add(name3);
        nameList.add(name4);
        nameList.add(name5);
        
        System.out.println(nameList);
        nameList.sort(null);
        System.out.println(nameList);

    }

}
