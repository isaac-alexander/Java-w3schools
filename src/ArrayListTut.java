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

// EXAMPLES

import java.util.ArrayList; // Import the ArrayList class
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
    }
}
