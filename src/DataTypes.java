// DATA TYPES

// Data types are divided into two groups:
//Primitive data types - includes byte, short, int, long, float, double, boolean and char
//Non-primitive data types - such as String, Arrays and Classes

// Primitive Data Types
// A primitive data type specifies the type of variable and the kind of values it can hold.

// There are eight primitive data types in Java:
// Data Type - Description
// byte - Stores whole numbers from -128 to 127
// short - Stores whole numbers from -32,768 to 32,767
// int - Stores whole numbers from -2,147,483,648 to 2,147,483,647
// long - Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
// float - Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
// double -Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
// boolean - Stores true or false values
// char - Stores a single character/letter or ASCII values

// You Cannot Change the Type
// Once a variable is declared with a type, it cannot change to another type later in the program:



public class DataTypes {
    public static void main(String[] args) {
        int myNum = 5;               // integer (whole number)
        float myFloatNum = 5.99f;    // floating point number
        char myLetter = 'D';         // character
        boolean myBool = true;       // boolean
        String myText = "Hello";     // String
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);


        // int myNum = 5;        // myNum is an int
        // myNum = "Hello";      // Error: cannot assign a String to an int

        // String myText = "Hi"; // myText is a String
        // myText = 123;         // Error: cannot assign a number to a String

        System.out.println(myNum);
        System.out.println(myText);
    }
}

// Note: This rule makes Java safer, because the compiler will stop you if you try to mix up types by mistake.

// If you really need to change between types, you must use type casting or conversion methods (for example, turning an int into a double).