// Other Useful Algorithms
//The Collections class contains many more algorithms, such as:
//
//Collections.max() - find the largest element
//Collections.min() - find the smallest element
//Collections.shuffle() - randomly shuffle elements
//Collections.frequency() - count how many times an element appears
//Collections.swap() - swap two elements in a list
//In this example, we use Collections.max() and Collections.min() to find the largest and smallest element in an ArrayList:






//Example

import java.util.*;

public class AlgorithmsTut2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);

        System.out.println("Max: " + Collections.max(numbers));
        System.out.println("Min: " + Collections.min(numbers));

        // Randomly shuffle an ArrayList:
        ArrayList<String> cards = new ArrayList<>();
        cards.add("Ace");
        cards.add("King");
        cards.add("Queen");
        cards.add("Jack");

        Collections.shuffle(cards);
        System.out.println(cards);

        // Collections.frequency() counts how many times an element appears in a list:
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");

        int count = Collections.frequency(fruits, "Banana");
        System.out.println("Banana appears: " + count + " times");

        //Collections.swap() swaps two elements in a list:
        ArrayList<String> fruits2 = new ArrayList<>();
        fruits2.add("Apple");
        fruits2.add("Banana");
        fruits2.add("Orange");
        fruits2.add("Mango");

        Collections.swap(fruits2, 0, 2); // Swap first and third element
        System.out.println(fruits2);
    }
}

// Summary
//An algorithm is a procedure to solve a problem.
//Java provides built-in algorithms in the Collections class.
//Common algorithms include searching, sorting, iterating, and finding min/max.
//Algorithms work together with data structures (like ArrayList, HashSet, etc.) to make your programs more powerful and efficient.
