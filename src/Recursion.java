// Java Recursion : Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simpler problems which are easier to solve.

// Recursion Example

// Adding two numbers together is easy to do, but adding a range of numbers is more complicated. In the following example, recursion is used to add a range of numbers together by breaking it down into the simple task of adding two numbers:

// Halting Condition
//Just as loops can run into the problem of infinite looping, recursive methods can run into the problem of infinite recursion. Infinite recursion is when the method never stops calling itself. Every recursive method should have a halting condition, which is the condition where the method stops calling itself. In the previous example, the halting condition is when the parameter k becomes 0.
//
//It is helpful to see a variety of different examples to better understand the concept. In this example, the method adds a range of numbers between a start and an end. The halting condition for this recursive method is when end is not greater than start:

// EXAMPLES
public class Recursion {
    //EXAMPLE 1 Recursion
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    // EXAMPLE 2 Halting Condition
    public static int sum2(int start, int end) {
        if (end > start) {
            return end + sum2(start, end - 1);
        } else {
            return end;
        }
    }

    // EXAMPLE 3 Countdown with Recursion
    //This example demonstrates how to use recursion to create a countdown function:
    static void countdown(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            countdown(n - 1);
        }
    }

    // EXAMPLE 4 Calculate Factorial with Recursion
    //This example uses a recursive method to calculate the factorial of 5:

    public static int factorial(int n) {
        if (n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }


    public static void main(String[] args) {
        //EXAMPLE 1 Recursion
        int result = sum(10);
        System.out.println(result); // output 55

        // EXAMPLE 2 Halting Condition
        int result2 = sum2(5, 10);
        System.out.println(result2); // output 45

        // EXAMPLE 3 Countdown with Recursion
        countdown(5); //output  5 4 3 2 1

        // EXAMPLE 4 Calculate Factorial with Recursion
        System.out.println("Factorial of 5 is " + factorial(5));
        // OUTPUT Factorial of 5 is 120

    }
}

//EXAMPLE 1 Recursion explained
// When the sum() method is called, it adds parameter k to the sum of all numbers smaller than k and returns the result. When k becomes 0, the method just returns 0. When running, the program follows these steps:
//
// 10 + sum(9)
// 10 + ( 9 + sum(8) )
// 10 + ( 9 + ( 8 + sum(7) ) )
//...
// 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
// 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0

// Since the method does not call itself when k is 0, the program stops there and returns the result.


// Factorial means multiplying a number by every number below it, down to 1. For example, the factorial of 5 is: 5 * 4 * 3 * 2 * 1 = 120. By definition, 0! is also 1.