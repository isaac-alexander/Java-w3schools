// Java Algorithms
// In the previous chapters, you learned how data structures (like ArrayList, HashMap, etc.) are used to store and organize data.

// Algorithms are used to solve problems by sorting, searching, and manipulating data structures.

// In Java, many useful algorithms are already built into the Collections class (found in the java.util package), so you don't have to write them from scratch.

// Searching
// To find elements in a list, Java provides helper methods. The most common is Collections.binarySearch(), which searches in a sorted list:

// Sorting
//Sorting is one of the most common algorithms. With ArrayList, you can use Collections.sort() to sort the elements:

// You can also sort in reverse order with Collections.sort(list, Collections.reverseOrder()):

// Iterating
//Iterating (looping) through elements is another common algorithm. You can use the for-each loop or the Iterator interface:



//Example
import java.util.*; // Import both ArrayList and Collections

public class AlgorithmsTut {
    public static void main(String[] args) {

        // Search for an element in a sorted ArrayList:
        ArrayList<String> names = new ArrayList<>();
        names.add("Liam");
        names.add("Jenny");
        names.add("Kasper");
        names.add("Angie");

        Collections.sort(names); // must be sorted first
        int index = Collections.binarySearch(names, "Angie");
        System.out.println("Angie is at index: " + index);

        // Sort a list of numbers:
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);

        Collections.sort(numbers);
        System.out.println(numbers);

        // Sort an ArrayList in descending order:
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println(numbers);

        // Iterating
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // Loop through an ArrayList using for-each:
        for (String c : colors) {
            System.out.println(c);
        }

        // Loop through an ArrayList using an Iterator:
        Iterator<String> it = colors.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
