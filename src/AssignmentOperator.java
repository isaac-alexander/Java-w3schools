// Assignment Operators

// Assignment operators are used to assign values to variables.

// In the example below, we use the assignment operator (=) to assign the value 10 to a variable called x:


// Real-Life Example: Tracking Savings
//Assignment operators can also be used in real-life scenarios. For example, you can use the += operator to keep track of savings when you add money to an account:

// Example

public class AssignmentOperator {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);

        // The addition assignment operator (+=) adds a value to a variable:
        int y = 10;
        y += 5;
        System.out.println(y);

        // Real-Life Example: Tracking Savings
        int savings = 100;
        savings += 50; // add 50 to savings
        System.out.println("Total savings: " + savings);

    }
}

// A list of all assignment operators:
//
// Operator	Example	    Same As
// =        x = 5	    x = 5
// +=   	x += 3	    x = x + 3
// -=   	x -= 3	    x = x - 3
// *=   	x *= 3	    x = x * 3
// / =  	x /= 3	    x = x / 3
// %=   	x %= 3	    x = x % 3
// &=   	x &= 3	    x = x & 3
// |=   	x |= 3	    x = x | 3
// ^=   	x ^= 3	    x = x ^ 3
// >>=  	x >>= 3	    x = x >> 3
// <<=  	x <<= 3	    x = x << 3