// Java HashMap
// A HashMap stores items in key/value pairs, where each key maps to a specific value.
// It is part of the java.util package and implements the Map interface.

// Instead of accessing elements by an index (like with ArrayList), you use a key to retrieve its associated value.

// A HashMap can store many different combinations, such as:
// String keys and Integer values
// String keys and String values

//Create a HashMap
//Create a HashMap object called capitalCities that will store String keys and String values:

//Example
// import java.util.HashMap; // Import the HashMap class

// HashMap<String, String> capitalCities = new HashMap<>();

// Now you can use methods like put() to add key/value pairs, get() to retrieve a value by key, and remove() to delete an entry - all by using keys instead of index numbers.

// Add Items: To add items to a HashMap, use the put() method:

// Loop Through a HashMap
//Loop through the items of a HashMap with a for-each loop.
//
//Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:


// Other Types
//Keys and values in a HashMap are actually objects. In the examples above, we used objects of type "String". Remember that a String in Java is an object (not a primitive type). To use other types, such as int, you must specify an equivalent wrapper class: Integer. For other primitive types, use: Boolean for boolean, Character for char, Double for double, etc:


//Examples

import java.util.Map;
// Import the HashMap class
import java.util.HashMap;

public class HashMapTut {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        // Note: In the example above, if the same key (like "Norway") is added more than once, the latest value will overwrite the previous one, because keys in a HashMap must be unique.
        System.out.println(capitalCities); // {Austria=Wien, USA=Washington DC, Norway=Oslo, England=London, India=New Dehli}

        // Access an Item
        //To access a value in the HashMap, use the get() method and refer to its key:
        System.out.println(capitalCities.get("England")); // London

        // Remove an Item
        //To remove an item, use the remove() method and refer to the key:
        capitalCities.remove("England");
        System.out.println(capitalCities); //{Austria=Wien, USA=Washington DC, Norway=Oslo, India=New Dehli}

        // To remove all items, use the clear() method:
        //     capitalCities.clear();

        // HashMap Size
        //To find out how many items there are, use the size() method
        System.out.println(capitalCities.size()); // 4
        // Note: The size only counts unique keys. If a key is added more than once, only the latest value is kept.

        // Loop Through a HashMap: Loop through the items of a HashMap with a for-each loop.
        // Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        // Create a HashMap object called people that will store String keys and Integer values:
        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("Name: " + i + " Age: " + people.get(i));
        }

        // The var Keyword
        // Using var instead of
        // HashMap<String, String> capitalCities2 = new HashMap<String, String>();
        var capitalCities2 = new HashMap<String, String>(); // using var

        capitalCities2.put("England", "London");
        capitalCities2.put("Germany", "Berlin");
        capitalCities2.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington D.C.");

        System.out.println(capitalCities2);

        // The Map Interface
        //Note: Sometimes you will see both Map and HashMap in Java code, like this:


    }
}
