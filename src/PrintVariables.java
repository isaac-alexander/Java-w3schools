// Display Variables
// The println() method is often used to display variables.
//
// To combine both text and a variable, use the + character:
// You can also use the + character to add a variable to another variable:

// In Java, the + symbol has two meanings:
//
//For text (strings), it joins them together (called concatenation).
//For numbers, it adds values together.
//For numeric values, the + character works as a mathematical operator (we use int (integer) variables here):


public class PrintVariables {
    static void main(String[] args) {

        String name = "John";
        System.out.println("Hello " + name);

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        int x = 5; // x stores the value 5
        int y = 6; // y stores the value 6
        System.out.println(x + y); // Print the value of x +  which is 11

//Mixing Text and Numbers
// Without parentheses, Java will treat the numbers as text after the first string:
        int a = 5;
        int b = 6;

        System.out.println("The sum is " + a + b);   // Prints: The sum is 56
        System.out.println("The sum is " + (a + b)); // Prints: The sum is 11

        // In the first line, Java combines "The sum is " with a, creating the string "The sum is 5". Then b is added to that string, so it becomes "The sum is 56".
        // In the second line, the parentheses make sure a + b is calculated first (resulting in 11), so the output is "The sum is 11".
    }
}
