// The else Statement
//The else statement lets you run a block of code when the condition in the if statement is false.

// Syntax

//if (condition) {
  // block of code to be executed if the condition is true
//} else {
  // block of code to be executed if the condition is false
//}


//EXAMPLES
public class ElseStatement {
    public static void main(String[] args) {
        boolean isRaining = false;

        if (isRaining) {
            System.out.println("Bring an umbrella!");
        } else {
            System.out.println("No rain today, no need for an umbrella!");
        }

        // This example says good day or good evening depending on the time:

        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        } // Output Good evening.
    }
}
// NOTE else does not have a condition - it runs when the if condition is false.
//Do not put a semicolon right after if (condition). That would end the statement early and make else behave unexpectedly.

// Since isRaining is false, the condition inside the if statement is not met. That means the if block is skipped, and the else block runs instead, printing "No rain today, no need for an umbrella!".

// EXAMPLE 2
// In the example above, time (20) is greater than 18, so the condition is false. Because of this, we move on to the else condition and print to the screen "Good evening". If the time was less than 18, the program would print "Good day".