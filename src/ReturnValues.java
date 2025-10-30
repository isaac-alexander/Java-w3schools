// Return Values
// In the previous page, we used the void keyword in all examples (like static void myMethod(int x)), which indicates that the method should not return a value.

// If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method:



//EXAMPLES

public class ReturnValues {
    // this returns the value of One Parameter
        static int myMethod(int x) {
            return 5 + x;
        }

        // This example returns the sum of a method's two parameters:
        static int myMethod2(int x, int y) {
            return x + y;
        }

        // You can also store the result in a variable (recommended, as it is easier to read and maintain):
        static int myMethod3(int x, int y) {
            return x + y;
        }

        // Practical Example
    // Here is a simple and fun "game example" using a method that returns a value, to show the double of the numbers 1 through 5 (using a for loop):
        static int doubleGame(int x) {
            return x * 2;
        }


    public static void main(String[] args) {
            System.out.println(myMethod(3)); // 8

            System.out.println(myMethod2(5,3)); // 8
            int z = myMethod3(5, 3);
            System.out.println(z); // 8
            for (int i = 1; i <= 5; i++) {
                System.out.println("Double of " + i + " is " + doubleGame(i));
            }
        }
}
