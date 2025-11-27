// Exception Handling (try and catch)
//Exception handling lets you catch and handle errors during runtime - so your program doesn't crash.
//
//It uses different keywords:
//
//The try statement allows you to define a block of code to be tested for errors while it is being executed.
//
//The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
//
//The try and catch keywords come in pairs:

//Syntax
//try {
//        //  Block of code to try
//        }
//        catch(Exception e) {
//        //  Block of code to handle errors
//        }

// Consider the following example:
//
//This will generate an error, because myNumbers[10] does not exist.
//
//public class Main {
//  public static void main(String[ ] args) {
//    int[] myNumbers = {1, 2, 3};
//    System.out.println(myNumbers[10]); // error!
//  }
//}
//The output will be something like this:
//
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
//        at Main.main(Main.java:4)
//Note: ArrayIndexOutOfBoundsException occurs when you try to access an index number that does not exist.

// Finally
//The finally statement lets you execute code, after try...catch, regardless of the result:

// The throw keyword
//The throw statement allows you to create a custom error.
//
//The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:
// EXAMPLE Throw an exception if age is below 18 (print "Access denied"). If age is 18 or older, print "Access granted":
// If age was 20, you would not get an exception:


public class Exceptions {
    // The throw keyword
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }


    public static void main(String[] args) {
        checkAge(15);

        // try...catch
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

        // finally
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}

// Errors and Exception Types
//The table below shows some of the most common errors and exceptions in Java, with a short description of each:
//
//Error/Exception	Description
//ArithmeticError	Occurs when a numeric calculation goes wrong
//ArrayIndexOutOfBoundsException	Occurs when trying to access an index number that does not exist in an array
//ClassNotFoundException	Occurs when trying to access a class that does not exist
//FileNotFoundException	Occurs when a file cannot be accessed
//InputMismatchException	Occurs when entering wrong input (e.g. text in a numerical input)
//IOException	Occurs when an input or output operation fails
//NullPointerException	Occurs when trying to access an object referece that is null
//NumberFormatException	Occurs when it is not possible to convert a specified string to a numeric type
//StringIndexOutOfBoundsException	Occurs when trying to access a character in a String that does not exist