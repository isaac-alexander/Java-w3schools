// Java Math
// The Java Math class has many methods that allows you to perform mathematical tasks on numbers.

// Math.max(x,y)
// The Math.max(x,y) method can be used to find the highest value of x and y:

// Math.min(x,y)
//The Math.min(x,y) method can be used to find the lowest value of x and y:

// Math.sqrt(x)
//The Math.sqrt(x) method returns the square root of x:

//Example

public class JavaMath {
    // Math.max(x,y)
    // The Math.max(x,y) method can be used to find the highest value of x and y:
    static void main(String[] args) {
        System.out.println(Math.max(5, 10)); //10

        // Math.min(x,y)
        // The Math.min(x,y) method can be used to find the lowest value of x and y:
        System.out.println(Math.min(5, 10)); //5

        // Math.sqrt(x)
        // The Math.sqrt(x) method returns the square root of x:
        System.out.println(Math.sqrt(64)); //8.0

        // Math.abs(x)
        //The Math.abs(x) method returns the absolute (positive) value of x:
        System.out.println(Math.abs(-4.7)); //4.7

        // Math.pow(x, y)
        // The Math.pow(x, y) method returns the value of x raised to the power of y:
        System.out.println(Math.pow(2, 8)); //256.0

        // Random Numbers
        // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        System.out.println(Math.random());

        // To get more control over the random number, for example, if you only want a random number between 0 and 100, you can use:

        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);
    }
}

// Note: Math.pow(2, 8) means 2 multiplied by itself 8 times:
// 2 * 2 * 2 * 2 * 2 * 2 * 2 * 2 = 256

// Note: The Math.pow() method always returns a double, even if the result is a whole number. For example, Math.pow(2, 8) returns 256.0 (not 256).