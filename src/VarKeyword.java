// The var Keyword
// The var keyword was introduced in Java 10 (released in 2018).

// The var keyword lets the compiler automatically detect the type of variable based on the value you assign to it.

// This helps you write cleaner code and avoid repeating types, especially for long or complex types.

// For example, instead of writing int x = 5;, you can write:
// When using var, the compiler understands that 5 is an int.

// When to Use var
// For simple variables, it's usually clearer to write the type directly (int, double, char, etc.).
//
// But for more complex types, such as ArrayList or HashMap, var can make the code shorter and easier to read:

// Examples

// Import the ArrayList class for the last example
import java.util.ArrayList;

public class VarKeyword {
    public static void main(String[] args) {
        var x = 5;  // x is an int
        System.out.println(x);

       // Example with Different Types

        var myNum = 5;          // int
        var myDouble = 9.98;    // double
        var myChar = 'D';       // char
        var myBoolean = true;   // boolean
        var myString = "Hello"; // String

        System.out.println(myNum);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myString);

        var cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

    }
}

// Important Notes
// 1. var only works when you assign a value at the same time (you can't declare var x; without assigning a value):

// var x;  Error
// var x = 5;   OK

// 2. Once the type is chosen, it stays the same. See example below:

// var x = 5;  // x is now an int
//x = 10;     // OK - still an int
//x = 9.99;   // Error - can't assign a double to an int