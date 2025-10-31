// Java Scope : In Java, variables are only accessible inside the region where they are created. This is called scope.

// Method Scope : Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared

// Block Scope : A block of code refers to all of the code between curly braces { }.
//Variables declared inside a block of code are only accessible by the code between the curly braces, and only after the line in which the variable was declared:

// Loop Scope : Variables declared inside a for loop only exist inside the loop:

// Class Scope : Variables declared inside a class but outside any method have class scope (also called fields). These variables can be accessed by all methods in the class:

public class JavaScope {
    public static void main(String[] args) {
        // Code here cannot use x

        int x = 100;

        // Code here can use x
        System.out.println(x); // 100

        // Code here CANNOT use x

        { // This is a block

            // Code here CANNOT use x

            int x2 = 100;

            // Code here CAN use x
            System.out.println(x2); // 100

        } // The block ends here

        // Code here CANNOT use x

        // Loop Scope
        for (int i = 0; i < 5; i++) {
            System.out.println(i); // i is accessible here
        } //OUTPUT 0 1 2 3 4

        // i is NOT accessible here


        // You can safely reuse the same variable name (i, j, etc.) in different loops in the same method:
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop 1: " + i);
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Loop 2: " + i);
        }


    }
}


// The for loop has its own block ({ ... }).

// The variable i declared in the loop header (int i = 0) is only accessible inside that loop block.

// Once the loop ends, i is destroyed, so you can't use it outside.

// Why this matters

// Loop variables are not available outside the loop.

//You can safely reuse the same variable name (i, j, etc.) in different loops in the same method: