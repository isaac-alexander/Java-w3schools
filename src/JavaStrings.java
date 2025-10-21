// Strings are used for storing text.
// A String variable contains a collection of characters surrounded by double quotes (""):

// String Length
// A String in Java is actually an object, which means it contains methods that can perform certain operations on strings.
//
//For example, you can find the length of a string with the length() method:

// More String Methods
//There are many string methods available in Java.

// The toUpperCase() method converts a string to upper case letters.
// The toLowerCase() method converts a string to lower case letters.

// Finding a Character in a String

// The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):

// You can use the charAt() method to access a character at a specific position in a string:

// Comparing Strings
// To compare two strings, you can use the equals() method:

// Removing Whitespace
// The trim() method removes whitespace from the beginning and the end of a string:

// Examples


public class JavaStrings {
    static void main(String[] args) {
        //Create a variable of type String and assign it a value:
        String greeting = "Hello";
        System.out.println(greeting);

        // find the length of a string
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        // converts a string to upper case letters and to lower case letters
        String text = "Hello World";
        System.out.println(text.toUpperCase());  // Outputs "HELLO WORLD"
        System.out.println(text.toLowerCase());  // Outputs "hello world"

        //returns the index (the position) of the first occurrence of a specified text in a string indexOf()
        String text2 = "Please locate where 'locate' occurs!";
        System.out.println(text2.indexOf("locate")); // Outputs 7

        // access a character at a specific position in a string charAt() method
        String text3 = "Hello";
        System.out.println(text3.charAt(0));  // H
        System.out.println(text3.charAt(4));  // o

        // Comparing Strings equals() method
        String text4 = "Hello";
        String text5 = "Hello";

        String text6 = "Greetings";
        String text7 = "Great things";

        System.out.println(text4.equals(text5)); // true
        System.out.println(text6.equals(text7)); // false

        // removing whitespace trim()
        String text8 = "   Hello World   ";
        System.out.println("Before: [" + text8 + "]");
        System.out.println("After:  [" + text8.trim() + "]");
    }
}
