// Java Arrays : Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
//
//To declare an array, define the variable type with square brackets [ ] :
//String[] cars;
// We have now declared a variable that holds an array of strings. To insert values to it, you can place the values in a comma-separated list, inside curly braces { }:
//
//String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

// To create an array of integers, you could write:
//
//int[] myNum = {10, 20, 30, 40};

// Access the Elements of an Array
// You can access an array element by referring to the index number.

// Change an Array Element
//To change the value of a specific element, refer to the index number:
//cars[0] = "Opel";

// The new Keyword
// You can also create an array by specifying its size with new. This makes an empty array with space for a fixed number of elements, which you can fill later:

// EXAMPLES

public class Arrays {
    public static void main(String[] args) {
        // This statement accesses the value of the first element in cars:z
        String[] carsA = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(carsA[0]); // Volvo

        // Change an Array Element
        //To change the value of a specific element, refer to the index number:
        String[] carsB = {"Volvo", "BMW", "Ford", "Mazda"};
        carsB[0] = "Opel";
        System.out.println(carsB[0]); // OUTPUT Opel

        // Array Length
        //To find out how many elements an array has, use the length property:
        String[] carsC = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(carsC.length); // OUTPUT = 4

        // The new Keyword
        String[] carsD = new String[4]; // size is 4

        carsD[0] = "Volvo";
        carsD[1] = "BMW";
        carsD[2] = "Ford";
        carsD[3] = "Mazda";

        System.out.println(carsD[0]); // Outputs Volvo

    }
}

// However, if you already know the values, you don't need to write new. Both of these create the same array:
//
//Example
//  With new
//String[] cars = new String[] {"Volvo", "BMW", "Ford", "Mazda"};

// Shortcut (most common)
//String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

// Note: You cannot write new String[4] {"Volvo", "BMW", "Ford", "Mazda"}.

//In Java, when using new, you either:

//Use new String[4] to create an empty array with 4 slots, and then fill them later
//Or use new String[] {"Volvo", "BMW", "Ford", "Mazda"} (without specifying the number of elements) to create the array and assign values at the same time



// Note: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

//Think of an array as numbered boxes, where each box stores an element:
//  Index   Element
//  0	    Volvo
//  1	    BMW
//  2	    Ford
//  3	    Mazda