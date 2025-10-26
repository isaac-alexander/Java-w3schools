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

// The if Statement

// The if statement specifies a block of code to be executed if a condition is true:
//
//Syntax
//if (condition) {
//        // block of code to be executed if the condition is true
//        }

// If Without Braces
//If an if statement has only one line of code, you can write it without curly braces { }:

// Potential Problem
// Without braces, only the first line after the if belongs to it. Any other lines will run no matter what, which can lead to unexpected results:

// The Safe Way
//To avoid mistakes, always use curly braces { }. This makes it clear which lines belong to the if statement:

//EXAMPLES

public class IfStatement {
    static void main(String[] args) {
        boolean isRaining = true;

        if (isRaining) {
            System.out.println("Bring an umbrella!"); // Bring an umbrella
        }

        if (20 > 18) {
            System.out.println("20 is greater than 18"); // 20 is greater than 18
        }

        int x = 20;
        int y = 18;
        if (x > y) {
            System.out.println("x is greater than y");
        }

        // Comparison is also often used to check if two values are equal, using the == operator:
        int x2 = 20;
        int y2 = 20;
        if (x2 == y2) {
            System.out.println("x2 is equal to y3"); // x2 is equal to y2
        }

        // Using Boolean Variables
        boolean isLightOn = true;

        if (isLightOn) {
            System.out.println("The light is on.");
        }

        boolean isLightOnNow = false;

        if (isLightOnNow) {
            System.out.println("The light is on now.");  // This will not be printed
        }

        System.out.println("This line always runs.");

        // If Without Braces
        //If an if statement has only one line of code, you can write it without curly braces { }:
        if (20 > 18)
            System.out.println("20 is greater than 18");

        // Potential Problem (without curles braces{})
        int x3 = 20;
        int y3 = 18;

        if (x3 > y3)
            System.out.println("x3 is greater than y3");
        System.out.println("This line runs no matter what (not part of the if statement)");

        // The Safe Way. To avoid mistakes, always use curly braces { }
        int x4 = 20;
        int y4 = 18;

        if (x4 > y4) {
            System.out.println("x4 is greater than y4");
            System.out.println("Both lines are part of the if");
        }

        System.out.println("I am outside if, not part of if!");

    }
}
// Note: Writing if (isLightOn) is the same as writing if (isLightOn == true), but shorter and easier to read.

//Here is the same example with the value false to see that the program continues even when the code block does not run: