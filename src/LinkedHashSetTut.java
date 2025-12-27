// Java LinkedHashSet
// A LinkedHashSet is a collection that stores unique elements and remembers the order they were added.
// It is part of the java.util package and implements the Set interface.

// Tip: Use LinkedHashSet when you want a set that does not allow duplicates and keeps the original insertion order.

// Create a LinkedHashSet Example
// Create a LinkedHashSet object called cars that will store strings:

// import java.util.LinkedHashSet; // Import the LinkedHashSet class

// LinkedHashSet<String> cars = new LinkedHashSet<>();
// Now you can use methods like add(), contains(), and remove() to manage your collection.

// Examples

// Add Elements: To add elements to a LinkedHashSet, use the add() method:

// Check if an Element Exists: Use contains() to check for an element:

// The var Keyword
//From Java 10, you can use the var keyword to declare a LinkedHashSet variable without writing the type twice. The compiler figures out the type from the value you assign.
//
//This makes code shorter, but many developers still use the full type for clarity. Since var is valid Java, you may see it in other code, so it's good to know that it exists:

import java.util.Set;
import  java.util.LinkedHashSet;
public class LinkedHashSetTut {
    public static void main(String[] args) {
        LinkedHashSet<String> cars = new LinkedHashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");

        System.out.println(cars.contains("Mazda"));// true
        System.out.println(cars); // [Volvo, BMW, Ford, Mazda]
        // Output: The elements will appear in the order they were added (e.g., [Volvo, BMW, Ford, Mazda]).
        //
        //Note: Duplicates like "BMW" are ignored.

        // Remove an Element: Use remove() to remove an element
        cars.remove("Volvo");
        System.out.println(cars); // [BMW, Ford, Mazda]

        // Remove All Elements Use clear() to remove all elements:
        //cars.clear();

        // LinkedHashSet Size: Use size() to count how many unique elements are in the set:
        System.out.println(cars.size()); // 3
        // Note: Duplicate values are not counted - only unique elements are included in the size.

        // Loop Through a LinkedHashSet : Loop through the elements of a LinkedHashSet with a for-each loop:
        for (String i : cars) {
            System.out.println(i); // BMW Ford Mazda
        }

        // The var Keyword
        // Using var instead of
        // LinkedHashSet<String> vehicles = new LinkedHashSet<String>();
        var vehicles = new LinkedHashSet<String>(); // using var
        vehicles.add("Volvo");
        vehicles.add("BMW");
        vehicles.add("Ford");
        vehicles.add("Mazda");
        System.out.println(vehicles); // [Volvo, BMW, Ford, Mazda]

        // The Set Interface
        //Note: Sometimes you will see both Set and LinkedHashSet in Java code, like this:
        Set<String> cars2 = new LinkedHashSet<>();
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("Mazda");
        System.out.println(cars2); // [Volvo, BMW, Ford, Mazda]

    }
}

// The Set Interface
// This means the variable (cars) is declared as a Set (the interface), but it stores a LinkedHashSet object (the actual set). Since LinkedHashSet implements the Set interface, this is possible.

//It works the same way, but some developers prefer this style because it gives them more flexibility to change the type later.


// HashSet      vs      LinkedHashSet
// Feature  -	HashSet -   LinkedHashSet
// Order    -   No guaranteed order -   Insertion order preserved
// Duplicates - Not allowed	    -   Not allowed
// Performance  -   Faster  -   Slightly slower (due to order tracking)

//Tip: Use HashSet when you only care about uniqueness and speed. Use LinkedHashSet when order matters.
