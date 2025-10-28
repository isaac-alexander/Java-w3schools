// Nested Loops
//It is also possible to place a loop inside another loop. This is called a nested loop.
//The "inner loop" will be executed one time for each iteration of the "outer loop":




//Example

public class NestedLoops {
    static void main(String[] args) {
        // Outer loop.
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }

        // Multiplication Table Example
        // This example uses nested loops to print a simple multiplication table (1 to 3):
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}

// Nested loops are useful when working with tables, matrices, or multi-dimensional data structures.