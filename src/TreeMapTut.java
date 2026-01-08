// Java TreeMap
// A TreeMap is a collection that stores key/value pairs in sorted order by key. It is part of the java.util package and implements the Map interface.

//Tip: Unlike HashMap, which does not maintain order, TreeMap keeps its keys sorted.

// Create a TreeMap
//Create a TreeMap that stores String keys and String values:

// Example
// import java.util.TreeMap; // Import the TreeMap class

// TreeMap<String, String> capitalCities = new TreeMap<>();

//Now you can use methods like put(), get(), and remove() to manage sorted key/value pairs.


// Add Items
//Use the put() method to add key/value pairs:

// Loop Through a TreeMap
//Loop through the items of a TreeMap with a for-each loop.
//
//Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:

// The var Keyword
//From Java 10, you can use the var keyword to declare a TreeMap variable without writing the type twice. The compiler figures out the type from the value you assign.
//
//This makes code shorter, but many developers still use the full type for clarity. Since var is valid Java, you may see it in other code, so it's good to know that it exists:


//EXAMPLES
import java.util.Map;

import java.util.TreeMap;

public class TreeMapTut {
    public static void main(String[] args) {
        TreeMap<String, String> capitalCities = new TreeMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo");  // Duplicate
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);
        // Output: The keys are sorted alphabetically (e.g., {Austria=Wien, England=London, India=New Dehli, Norway=Oslo, USA=Washington DC}).
        //
        //Note: Duplicates like "Norway" will only appear once.

     //
        //Access an Item: Use get() with the key to access its value:
        System.out.println(capitalCities.get("England")); // Output London

        // Remove Items: Use remove() to delete a key/value pair by key:
        capitalCities.remove("England");
        System.out.println(capitalCities);
        // Use clear() to remove all items:
        // capitalCities.clear();
        //    System.out.println(capitalCities);

        // TreeMap Size: Use size() to count the number of key/value pairs:
        System.out.println(capitalCities.size());


        // Loop Through a TreeMap
        //Loop through the items of a TreeMap with a for-each loop.

        //Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:

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

        // The var Keyword
        // Using var instead of
        // TreeMap<String, String> capitalCities = new TreeMap<String, String>();
        var capitalCities2 = new TreeMap<String, String>(); // using var

        capitalCities2.put("England", "London");
        capitalCities2.put("Germany", "Berlin");
        capitalCities2.put("Norway", "Oslo");
        capitalCities2.put("USA", "Washington D.C.");

        System.out.println(capitalCities2);

        // The Map Interface

        Map<String, String> capitalCities3 = new TreeMap<>();
        capitalCities3.put("England", "London");
        capitalCities3.put("Germany", "Berlin");
        capitalCities3.put("Norway", "Oslo");
        capitalCities3.put("USA", "Washington D.C.");

        System.out.println(capitalCities3);
    }
}

// TreeMap vs HashMap
//Feature	HashMap	TreeMap
//Order	No guaranteed order	Sorted by keys
//Null Keys	Allows one null key	Does not allow null keys
//Performance	Faster (no sorting)	Slower (maintains sorted order)
//Tip: Use HashMap for performance, and TreeMap when you need sorted keys.


//Map interface
//This means the variable (capitalCities) is declared as a Map (the interface), but it stores a TreeMap object (the actual map). Since TreeMap implements the Map interface, this is possible.
//
//It works the same way, but some developers prefer this style because it gives them more flexibility to change the type later.
