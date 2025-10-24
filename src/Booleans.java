// Boolean Types
// Very often in programming, you will need a data type that can only have one of two values, like:

// YES / NO
// ON / OFF
// TRUE / FALSE
//For this, Java has a boolean data type, which can only take the values true or false:

// In practice, booleans are most often the result of expressions, and are used to test conditions in program

// Boolean Expressions

//A boolean expression returns a boolean value: true or false.
// This is useful to build logic and make decisions in programs.
// For example, you can use a comparison operator, such as the greater than (>) operator, to find out if an expression (or a variable) is true or false:

// Real Life Example
// Find out if a person is old enough to vote.
//In the example below, we use the >= comparison operator to find out if the age (25) is greater than OR equal to the voting age limit, which is set to 18:


//Examples

public class Booleans {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);

        // Boolean Expressions
        int x = 10;
        int y = 9;
        System.out.println(x > y); // returns true, because 10 is higher than 9
        System.out.println(10 > 9); // returns true, because 10 is higher than 9

        // In the examples below, we use the equal to (==) operator to evaluate an expression::
        int z = 10;
        System.out.println(z == 10); // returns true, because the value of z is equal to 10
        System.out.println(10 == 15); // returns false, because 10 is not equal to 15

        // Real Life Example
        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge); // returns true because 25-year-olds are allowed to vote!

        // OR  wrap the code above in an if...else statement, so we can perform different actions depending on the result:

        int myAge2 = 25;
        int votingAge2 = 18;

        if (myAge2 >= votingAge2) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        } // Old enough to vote!

    }
}
