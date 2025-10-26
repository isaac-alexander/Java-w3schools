// Short Hand if...else
//There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.

//It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:

// Syntax
// variable = (condition) ? expressionTrue :  expressionFalse;


// EXAMPLES
public class ShortHandIfElse {
    static void main(String[] args) {
        // If it rains, bring an umbrella. Otherwise (else), go outside without one:
        boolean isRaining = false;

        if (isRaining) {
            System.out.println("Bring an umbrella!");
        } else {
            System.out.println("No rain today, no need for an umbrella!");
        } // No rain today, no need for an umbrella!

        // This example says good day or good evening depending on the time:
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        } // Good evening
    }
}

// EXAMPLES EXPLAINED
// 1. Since isRaining is false, the condition inside the if statement is not met. That means the if block is skipped, and the else block runs instead, printing "No rain today, no need for an umbrella!".

// 2. In the example above, time (20) is greater than 18, so the condition is false. Because of this, we move on to the else condition and print to the screen "Good evening". If the time was less than 18, the program would print "Good day".



//Notes
//else does not have a condition - it runs when the if condition is false.
//Do not put a semicolon right after if (condition). That would end the statement early and make else behave unexpectedly.