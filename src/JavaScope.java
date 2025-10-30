// Java Scope : In Java, variables are only accessible inside the region where they are created. This is called scope.

// Method Scope : Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared

// Block Scope : A block of code refers to all of the code between curly braces { }.
//Variables declared inside a block of code are only accessible by the code between the curly braces, and only after the line in which the variable was declared:

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

    }
}
