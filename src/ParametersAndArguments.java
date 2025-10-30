// Parameters and Arguments
// Information can be passed to methods as a parameter. Parameters act as variables inside the method.

// Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

// The following example has a method that takes a String called fname as parameter. When the method is called, we pass along a first name, which is used inside the method to print the full name:


// When a parameter is passed to the method, it is called an argument. So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.


public class ParametersAndArguments {
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    // Multiple Parameters
    // You can have as many parameters as you like:

    static void myMethod2(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    // A Method with If...Else
    static void checkAge(int age) {
        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");

        // Note that when you are working with multiple parameters, the method call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order
        myMethod2("Liam", 5);
        myMethod2("Jenny", 8);
        myMethod2("Anja", 31);

        // Call the checkAge method and pass along an age of 20
        checkAge(20); // Access granted - You are old enough!
    }

}
