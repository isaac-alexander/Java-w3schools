// String Concatenation
// The + operator can be used between strings to combine them. This is called concatenation:

// Concatenation in Sentences
// You can use string concatenation to build sentences with both text and variables:

// The concat() Method
// You can also use the concat() method to concatenate strings:

// You can also join more than two strings by chaining concat() calls:

//Example



public class Concatenation {
    public static void main(String args[]) {
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName); // John Doe
        // Note that we have added an empty text (" ") to create a space between firstName and lastName on print.

        // Concatenation in Sentences
        String name = "John";
        int age = 25;
        System.out.println("My name is " + name + " and I am " + age + " years old."); // My name is John and I am 25 years old.

        // The concat() Method
        String firstName2 = "John ";
        String lastName2 = "Doe";
        System.out.println(firstName2.concat(lastName2)); // John Doe

        String a = "Java ";
        String b = "is ";
        String c = "fun!";
        String result = a.concat(b).concat(c);
        System.out.println(result); // Java is fun
    }
}
