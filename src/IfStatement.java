// Java Conditions and If Statements
// Conditions and if statements let you control the flow of your program - deciding which code runs, and which code is skipped.
// Think of it like real life: If it rains, take an umbrella. Otherwise, do nothing.
// Every if statement needs a condition that results in true or false.
// This means if statements work hand-in-hand with boolean values:

// Most often, conditions are created using comparison operators, like the ones below:

// Less than: a < b
// Less than or equal to: a <= b
// Greater than: a > b
// Greater than or equal to: a >= b
// Equal to: a == b
// Not equal to: a != b
// You can use these conditions to perform different actions for different decisions.

// Java has the following conditional statements:

// Use if to specify a block of code to be executed, if a specified condition is true
// Use else to specify a block of code to be executed, if the same condition is false
// Use else if to specify a new condition to test, if the first condition is false
// Use switch to specify many alternative blocks of code to be executed

//EXAMPLES

public class IfStatement {
    static void main(String[] args) {
        boolean isRaining = true;

        if (isRaining) {
            System.out.println("Bring an umbrella!"); // Bring an umbrella
        }
    }
}
