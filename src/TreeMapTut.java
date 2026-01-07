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


//EXAMPLES
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
    }
}
