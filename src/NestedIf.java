// Nested If
//You can also place an if statement inside another if. This is called a nested if statement.

//A nested if lets you check for a condition only if another condition is already true.

//Syntax
//if (condition1) {
  // code to run if condition1 is true
//  if (condition2) {
    // code to run if both condition1 and condition2 are true
//  }
//}

// Real-Life Example
//Nested if statements are useful when you need to test multiple conditions that depend on each other. For example, checking if a person is old enough to vote, and if they are a citizen:


// EXAMPLE
public class NestedIf {
    // In this example, we first check if x is greater than 10. If it is, we then check if y is greater than 20:
    static void main(String[] args) {
        int x = 15;
        int y = 25;

        if (x > 10) {
            System.out.println("x is greater than 10");

            // Nested if
            if (y > 20) {
                System.out.println("y is also greater than 20");
            }
        } // x is greater than 10 // y is also greater than 20

        // Real-Life Example
        int age = 20;
        boolean isCitizen = true;

        if (age >= 18) {
            System.out.println("Old enough to vote.");

            if (isCitizen) {
                System.out.println("And you are a citizen, so you can vote!");
            } else {
                System.out.println("But you must be a citizen to vote.");
            }
        } else {
            System.out.println("Not old enough to vote.");
        }
        // Old enough to vote.
        //And you are a citizen, so you can vote!
    }
}

// Notes
//You can nest as many if statements as you want, but avoid making the code too deep - it can become hard to read.
//Nested if is often used together with else and else if for more complex decision making.