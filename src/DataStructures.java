// Java Data Structures
//Data structures are ways to store and organize data so you can use it efficiently.
//
//An array is an example of a data structure, which allows multiple elements to be stored in a single variable.
//
//Java includes many other data structures as well, in the java.util package. Each is used to handle data in different ways.
//Some of the most common are:
//
//ArrayList
//HashSet
//HashMap

// ArrayList
//An ArrayList is a resizable array that can grow as needed.
//
//It allows you to store elements and access them by index.

// HashSet
//A HashSet is a collection where every element is unique - no duplicates are allowed.

// HashMap
//A HashMap stores key-value pairs, which are great when you want to store values and find them by a key (like a name or ID):

// Example

// Import the ArrayList class
import java.util.ArrayList;

// Import the HashSet class
import java.util.HashSet;

// Import the HashMap class
import java.util.HashMap;

public class DataStructures {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars); // OUTPUT: [Volvo, BMW, Ford, Mazda]

        // HashSet
        HashSet<String> cars2 = new HashSet<String>();
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("BMW");
        cars2.add("Mazda");
        System.out.println(cars2); // OUTPUT : [Volvo, Mazda, Ford, BMW]
        // Note: In the example above, even though BMW is added twice it only appears once in the set because every element in a set has to be unique.

        // HashMap
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities); // OUTPUT: {USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
    }
}

// Data Structures Overview
//Data Structure	Stores	Keeps Order?	Allows Duplicates?	Best For
//ArrayList	Ordered elements	Yes	Yes	Accessing elements by index
//HashSet	Unique elements	No	No	Avoiding duplicates, fast checks
//HashMap	Key-value pairs	No	Yes (keys are unique)	Fast lookup by key
