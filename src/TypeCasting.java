// Java Type Casting

// Type casting means converting one data type into another. For example, turning an int into a double.

// In Java, there are two main types of casting:

// Widening Casting (automatic) - converting a smaller type to a larger type size
// byte -> short -> char -> int -> long -> float -> double

// Narrowing Casting (manual) - converting a larger type to a smaller type size
// double -> float -> long -> int -> char -> short -> byte


// Widening Casting

// Widening casting is done automatically when passing a smaller size type into a larger size type.

// This works because there is no risk of losing information. For example, an int value can safely fit inside a double:

// Narrowing Casting

// Narrowing casting must be done manually by placing the type in parentheses () in front of the value.

// This is required because narrowing may result in data loss (for example, dropping decimals when converting a double to

//EXAMPLES
public class TypeCasting {
    public static void main(String[] args) {
        //Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);
        System.out.println(myDouble);

        //Narrowing Casting
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Explicit casting: double to int

        System.out.println(myDouble2);
        System.out.println(myInt2);

        //Real-Life Example
        // Set the maximum possible score in the game to 500
        int maxScore = 500;

        // The actual score of the user
        int userScore = 423;

    /* Calculate the percentage of the user's score in relation to the maximum available score.
    Convert userScore to double to make sure that the division is accurate */
        double percentage = (double) userScore / maxScore * 100.0d;

        // Print the result
        System.out.println("User's percentage is " + percentage);
    }
}

// Above is a real-life example of type casting. We calculate the percentage of a user's score in relation to the maximum score in a game.

//We use type casting to make sure that the result is a floating-point value, rather than an integer: