// Java HashSet
// A HashSet is a collection of elements where every element is unique.

// It is part of the java.util package and implements the Set interface.

// Create a HashSet ....Example
//Create a HashSet object called cars that will store strings:

// import java.util.HashSet; // Import the HashSet class

// HashSet<String> cars = new HashSet<String>();

// Now you can use methods like add(), contains(), and remove() to manage your collection of unique elements.

// Add Elements
// To add elements to a HashSet, use the add() method:

// Check If an Element Exists
// To check whether an element exists in a HashSet, use the contains() method:

// Remove an Element
// To remove an element, use the remove() method

// HashSet Size
// Use size() to count how many unique elements are in the set:


//Example

// Import the HashSet class
import java.util.HashSet;

public class HashSetTut {

    public static void main(String[] args) {
        // Add Elements
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");
        // Note: In the example above, even though "BMW" is added twice, it only appears once in the set because sets do not allow duplicate elements.

        //Check If an Element Exists contains()
        System.out.println(cars.contains("Mazda")); // true

        System.out.println(cars); // [Volvo, Mazda, Ford, BMW]

        // Remove an Element remove()

        cars.remove("Volvo");
        System.out.println(cars); // [Mazda, Ford, BMW]

        // To remove all elements, use the clear() method:
        //cars.clear();
        //System.out.println(cars);

        // HashSet Size size()
        System.out.println(cars.size()); // 3
        // Note: Duplicate values are not counted - only unique elements are included in the size.


        // Loop Through a HashSet
        // Loop through the elements of an HashSet with a for-each loop:
        for(String i : cars){
            System.out.println(i);
        }
    }

}
