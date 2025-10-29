// Loop Through an Array : You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run.

// Loop Through an Array with For-Each
//There is also a "for-each" loop, which is used exclusively to loop through elements in an array (or other data structures):
//
// Syntax
// for (type variable : arrayname) {
//  // code block to be executed
// }

// The colon (:) is read as "in". So you can read the loop as: "for each variable in array".


// EXAMPLES

public class ArraysLoop {
    public static void main(String[] args) {
        // This example creates an array of strings and then uses a for loop to print each element, one by one:
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        } // Volvo BMW Ford Mazda

        //An array of integers and use a for loop to print each value:
        int[] numbers = {10, 20, 30, 40};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        } //OUTPUT = 10 20 30 40

        // Calculate the Sum of Elements
        int[] numbersB = {1, 5, 10, 25};
        int sum = 0;

        // Loop through the array and add each element to sum
        for (int i = 0; i < numbersB.length; i++) {
            sum += numbersB[i];
        }
        System.out.println("The sum is: " + sum);  // The sum is 41

        // Loop Through an Array with For-Each
        // The following example uses a for-each loop to print all elements in the cars array:
        String[] vehicles = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String vehicle : vehicles) {
            System.out.println(vehicle);
        } // OUTPUT = Volvo BMW Ford Mazda

        // EXAMPLE 2
        String[] seats = {"Jenny", "Liam", "Angie", "Bo"};

        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat number " + i + " is taken by " + seats[i]);
        } // OUTPUT = Seat number 0 is taken by Jenny
        // Seat number 1 is taken by Liam
        // Seat number 2 is taken by Angie
        // Seat number 3 is taken by Bo
    }
}

// This means: for each String in the vehicles array (here called vehicle), print its value.

// Compared to a regular for loop, the for-each loop is easier to write and read because it does not need a counter (like i < vehicles.length). However, it only gives you the values, not their positions (indexes) in the array.

// So, if you need both the position (index) of each element and its value, a regular for loop is the right choice. For example, when printing seat numbers in a theater row, you need to show both the seat number (the index) and who is sitting there (the value):