// Java ArrayList
//An ArrayList is like a resizable array.
//
//It is part of the java.util package and implements the List interface.
//
//The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want.

// Create an ArrayList
//To use an ArrayList, you must first import it from java.util:
//
//Example
// Create an ArrayList object called cars that will store strings:

// import java.util.ArrayList; // Import the ArrayList class
//
//ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object

// Now you can use methods like add(), get(), set(), and remove() to manage your list of elements.


// Add Elements
//To add elements to an ArrayList, use the add() method:


// Access an Element
//To access an element in the ArrayList, use the get() method and refer to the index number:

// Change an Element
//To modify an element, use the set() method and refer to the index number:

// Remove an Element
//To remove an element, use the remove() method and refer to the index number:

// ArrayList Size
//To find out how many elements an ArrayList have, use the size method:

// Loop Through an ArrayList
//Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run:


// Sort an ArrayList
//Another useful class in the java.util package is the Collections class, which include the sort() method for sorting lists alphabetically or numerically:


// EXAMPLES

import java.util.ArrayList; // Import the ArrayList class
import java.util.Collections;  // Import the Collections class to sort arraylist

public class ArrayListTut {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();

        // Add Elements use the add() method
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        // You can also add an element at a specified position by referring to the index number:
        cars.add(0, "Toyota"); // Insert element at the beginning of the list (index 0)

        System.out.println(cars);

        cars.set(0, "Opel"); // Change an Element set()
        System.out.println(cars);

        System.out.println(cars.get(0)); // Get the first element

        cars.remove(0); // Remove an element
        System.out.println(cars);

        // To remove all the elements in the ArrayList, use the clear() method:
        // cars.clear();

        // ArrayList Size
        //To find out how many elements an ArrayList have, use the size method:
        System.out.println(cars.size());

        // Loop Through an ArrayList
        // Loop through the elements of an ArrayList with a for loop, and use the size() method to specify how many times the loop should run:

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i) + " for loop with size");
        }

        // You can also loop through an ArrayList with the for-each loop:
        for (String i : cars) {
            System.out.println(i);
        }

        Collections.sort(cars);

        for (String i : cars) {
            System.out.println(i);
        }

        // Create an ArrayList to store numbers (add elements of type Integer):
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }
        Collections.sort(myNumbers);

        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
//
//Other Types
//Elements in an ArrayList are actually objects. In the examples above, we created elements (objects) of type "String". Remember that a String in Java is an object (not a primitive type). To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:

// The var Keyword
//From Java 10, you can use the var keyword to declare an ArrayList variable without writing the type twice. The compiler figures out the type from the value you assign.
//
//This makes code shorter, but many developers still use the full type for clarity. Since var is valid Java, you may see it in other code, so it's good to know that it exists:

// import java.util.ArrayList;
//
//public class Main {
//  public static void main(String[] args) {
//    // Using var instead of
//    // ArrayList<String> cars = new ArrayList<String>();
//    var cars = new ArrayList<String>(); // using var
//    cars.add("Volvo");
//    cars.add("BMW");
//    cars.add("Ford");
//    cars.add("Mazda");
//    System.out.println(cars);
//  }
//}

