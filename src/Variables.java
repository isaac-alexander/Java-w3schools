// Java Variables
//Variables are containers for storing data values.

//In Java, there are different types of variables, for example:
//String - stores text, such as "Hello". String values are surrounded by double quotes
//int - stores integers (whole numbers), without decimals, such as 123 or -123
//float - stores floating point numbers, with decimals, such as 19.99 or -19.99
//char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
//boolean - stores values with two states: true or false

// Declaring (Creating) Variables

//To create a variable in Java, you need to:
//Choose a type (like int or String)
//Give the variable a name (like x, age, or name)
//Optionally assign it a value using =
//Here's the basic syntax:

// type variableName = value;
// For example, if you want to store some text, you can use a String:
//
//Example
//Create a variable called name of type String and assign it the value "John".
//Then we use println() to print the name variable:

// To create a variable that should store a number, you can use int:
// Create a variable called myNum of type int and assign it the value 15:

// You can also declare a variable without assigning the value, and assign the value later:

// Note that if you assign a new value to an existing variable, it will overwrite the previous value:
// EXAMPLE Change the value of myNum from 15 to 20:

public class Variables {
    public static void main(String[] args) {
        String name = "John";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        int myNum2;
        myNum2 = 16;
        System.out.println(myNum2);

        myNum = 20;  // myNum is now 20
        System.out.println(myNum);
    }
}


//Final Variables
//If you don't want others (or yourself) to overwrite existing values, use the final keyword (this will declare the variable as "final" or "constant", which means unchangeable and read-only):

// Example
//final int myNum = 15;
//myNum = 20;  // will generate an error: cannot assign a value to a final variable

// Other Types
//A demonstration of how to declare variables of other types:
//
//Example
//int myNum = 5;
//float myFloatNum = 5.99f;
//char myLetter = 'D';
//boolean myBool = true;
//String myText = "Hello";