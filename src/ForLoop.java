// Java For Loop

// Syntax
// for (statement 1; statement 2; statement 3) {
    // code block to be executed
//}

// Statement 1 is executed (one time) before the execution of the code block.

// Statement 2 defines the condition for executing the code block.

//Statement 3 is executed (every time) after the code block has been executed.

//EXAMPLES

public class ForLoop {
    public static void main(String[] args) {
        // Print Numbers
        // The example below will print the numbers 0 to 4
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        } // OUTPUT = 0 1 2 3 4

        // Print Even Numbers
        // This example prints even values between 0 and 10:
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        } // OUTPUT = 0 2 4 6 8 10

        // Sum of Numbers
        // This example calculates the sum of numbers from 1 to 5:

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is " + sum); //  Sum is 15

        // Countdown
        // This example prints a countdown from 5 to 1:
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        } //OUTPUT = 5 4 3 2 1

        // For Loop With False Condition
        // Just like a while loop, a for loop may also never run. If the condition is false right from the start, the code inside the loop will be skipped entirely:
        for (int i = 10; i < 5; i++) {
            System.out.println("This will never be printed");
        }
    }
}

// Statement 1 sets a variable before the loop starts: int i = 0
//Statement 2 defines the condition for the loop to run: i < 5. If the condition is true, the loop will run again; if it is false, the loop ends.
//Statement 3 increases a value each time the code block has run: i++