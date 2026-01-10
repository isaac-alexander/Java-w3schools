// Java LinkedHashMap
//A LinkedHashMap stores keys and values, and keeps them in the same order you put them in.
//
//It is part of the java.util package and implements the Map interface.
//
//Tip: Use LinkedHashMap when you want predictable iteration order (insertion order).

// Create a LinkedHashMap
//Create a LinkedHashMap object called capitalCities that will store String keys and String values:
//
//Example
// import java.util.LinkedHashMap; // Import the LinkedHashMap class
// LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();

// Now you can use methods like put() to add key/value pairs, get() to retrieve a value by key, and remove() to delete an entry - all while maintaining insertion order.
//
//Add Items
//Use the put() method to add items to the LinkedHashMap:

// The var Keyword
//From Java 10, you can use the var keyword to declare a LinkedHashMap variable without writing the type twice. The compiler figures out the type from the value you assign.
//
//This makes code shorter, but many developers still use the full type for clarity. Since var is valid Java, you may see it in other code, so it's good to know that it exists:

// The Map Interface
//Note: Sometimes you will see both Map and LinkedHashMap in Java code, like this:


//Example
import java.util.Map;

// Import the LinkedHashMap class
import java.util.LinkedHashMap;

public class LinkedHashMapTut {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();

        // Use the put() method to add items to the LinkedHashMap:
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);
        // Output: The items will appear in the order they were added (e.g., {England=London, India=New Dehli, Austria=Wien, Norway=Oslo, USA=Washington DC}).
        //
        //Note: Duplicates like "Norway" are ignored.

        // Access an Item: Use get() with a key to get its associated value
        System.out.println(capitalCities.get("England"));

        // Remove an Item: Use remove() to remove an item by key:
        // capitalCities.remove("England");
        // System.out.println(capitalCities);

        // Use clear() to remove all items:
        // capitalCities.clear();
        // System.out.println(capitalCities);

        // LinkedHashMap Size: Use size() to check how many key/value pairs are in the map:
        System.out.println(capitalCities.size());

        // Loop Through a LinkedHashMap
        //You can loop through a LinkedHashMap using a for-each loop. Use:

        //keySet() to get all keys
        //values() to get all values

        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print value
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("Key: " + i + ", Value: " + capitalCities.get(i));
        }

        // The var Keyword
        // Using var instead of
        // LinkedHashMap<String, String> capitalCities2 = new LinkedHashMap<String, String>();
        var capitalCities2 = new LinkedHashMap<String, String>(); // using var

        capitalCities2.put("England", "London");
        capitalCities2.put("Germany", "Berlin");
        capitalCities2.put("Norway", "Oslo");
        capitalCities2.put("USA", "Washington D.C.");

        System.out.println(capitalCities2);

        // The Map Interface
        Map<String, String> capitalCities3 = new LinkedHashMap<>();
        capitalCities3.put("England", "London");
        capitalCities3.put("Germany", "Berlin");
        capitalCities3.put("Norway", "Oslo");
        capitalCities3.put("USA", "Washington D.C.");

        System.out.println(capitalCities3);
        // This means the variable (capitalCities) is declared as a Map (the interface), but it stores a LinkedHashMap object (the actual map). Since LinkedHashMap implements the Map interface, this is possible.

    }

}

// HashMap vs LinkedHashMap
//Feature	HashMap	LinkedHashMap
//Order	No guaranteed order	Insertion order preserved
//Performance	Faster for random access	Slightly slower due to ordering
//Duplicates	Keys must be unique	Keys must be unique
//Tip: Use LinkedHashMap when you want the map to remember the order in which entries were added.

