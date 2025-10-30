// With method overloading, multiple methods can have the same name with different parameters:
// Example
// int myMethod(int x)
// float myMethod(float x)
// double myMethod(double x, double y)

// Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.

// EXAMPLE
public class MethodOverloading {
    // Consider the following example, which has two methods that add numbers of different type:
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    // Instead of defining two methods that should do the same thing, it is better to overload one.

    //In the example below, we overload the plusMethod method to work for both int and double:
    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }
    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1); // int: 13
        System.out.println("double: " + myNum2); // double: 10.559999999999999

        // Method Overloading
        int myNum1a = plusMethod(8, 5);
        double myNum2a = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1a); // int: 13
        System.out.println("double: " + myNum2a); // double: 10.559999999999999
    }
}

// Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.
