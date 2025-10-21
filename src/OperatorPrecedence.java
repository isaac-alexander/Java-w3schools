// Java Operator Precedence

// When a calculation contains more than one operator, Java follows order of operations rules to decide which part to calculate first.

//For example, multiplication happens before addition:

// Order of Operations
// Here are some common operators, from highest to lowest priority:

// () - Parentheses
// *, /, % - Multiplication, Division, Modulus
// +, - - Addition, Subtraction
// >, <, >=, <= - Comparison
// ==, != - Equality
// && - Logical AND
// || - Logical OR
// = - Assignment

// EXAMPLES

public class OperatorPrecedence {
    static void main(String[] args) {
        //multiplication happens before addition, unless you add parentheses:
        int result1 = 2 + 3 * 4;     // 2 + 12 = 14
        int result2 = (2 + 3) * 4;   // 5 * 4 = 20

        System.out.println(result1);
        System.out.println(result2);

        // Subtraction and addition are done from left to right, unless you add parentheses:
        int getResult1 = 2 + 3 * 4;     // 2 + 12 = 14
        int getResult2 = (2 + 3) * 4;   // 5 * 4 = 20

        System.out.println(getResult1);
        System.out.println(getResult2);

    }
}

// Why Does This Happen?

// In 2 + 3 * 4, the multiplication is done first, so the answer is 14.

// If you want the addition to happen first, you must use parentheses: (2 + 3) * 4, which gives 20.

// Always use parentheses ( ) if you want to make sure the calculation is done in the order you expect. It also makes your code easier to read.