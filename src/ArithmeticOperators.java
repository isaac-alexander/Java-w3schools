// Arithmetic Operators

// Arithmetic operators are used to perform common mathematical operations.

// + Addition Adds together two values	x + y
// - Subtraction Subtracts one value from another x - y
// * Multiplication Multiplies two values x * y

// / Division Divides one value by another x / y
// % Modulus Returns the division remainder x % y
// ++ Increment	Increases the value of a variable by 1 ++x
// -- Decrement	Decreases the value of a variable by 1 --x


// Note: When dividing two integers in Java, the result will also be an integer. For example, 10 / 3 gives 3. If you want a decimal result, use double values, like 10.0 / 3.

// Examples

public class ArithmeticOperators {
    static void main(String[] args) {
        int x = 10;
        int y = 3;

        System.out.println(x + y); // 13
        System.out.println(x - y); // 7
        System.out.println(x * y); // 30
        System.out.println(x / y); // 3
        System.out.println(x % y); // 1

        int z = 5;
        ++z;
        System.out.println(z); // 6
        --z;
        System.out.println(z); // 5

        int a = 10;
        int b = 3;
        System.out.println(a / b);   // Integer division, result is 3

        double c = 10.0d;
        double d = 3.0d;
        System.out.println(c / d);   // Decimal division, result is 3.333...

        // Incrementing and Decrementing
        int e = 5;

        ++e; // Increment x by 1
        System.out.println(e); // 6

        --e; // Decrement x by 1
        System.out.println(e); // 5

        // Real Life Example: Counting People
        int peopleInRoom = 0;

        // 3 people enter
        peopleInRoom++;
        peopleInRoom++;
        peopleInRoom++;

        System.out.println(peopleInRoom); // 3

        // 1 person leaves
        peopleInRoom--;

        System.out.println(peopleInRoom); // 2
    }
}

// Incrementing and Decrementing
//Incrementing and decrementing are very common in programming, especially when working with counters, loops, and arrays (which you will learn more about in later chapters).
//
//The ++ operator increases a value by 1, while the -- operator decreases a value by 1:

// Above is Real Life Example: Counting People

// Real Life Example: Counting People
//Imagine you are building a program to count how many people enter and leave a room. You can use ++ to increase the counter when someone enters, and -- to decrease it when someone leaves: