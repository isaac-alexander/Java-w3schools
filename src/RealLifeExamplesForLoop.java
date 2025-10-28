// Real-Life Examples

public class RealLifeExamplesForLoop {
    public static void main(String[] args) {
        //EXAMPLE 1.  A program that counts to 100 by tens:
        for (int i = 0; i <= 100; i += 10) {
            System.out.println(i);
        } // OUTPUT 0 10 20 30 40 50 60 70 80 90 100

        // EXAMPLE 2. A program that only print even values between 0 and 10:
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        } // OUTPUT 0 2 4 6 8 10

        // EXAMPLE 3. A  program that prints the multiplication table for a specified number:
        int number = 2;

        // Print the multiplication table for the number 2
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        } // OUTPUT =
        // 2 x 1 = 2
        // 2 x 2 = 4
        // 2 x 3 = 6
        // 2 x 4 = 8
        // 2 x 5 = 10
        // 2 x 6 = 12
        // 2 x 7 = 14
        // 2 x 8 = 16
        // 2 x 9 = 18
        // 2 x 10 = 20

        // EXAMPLE 4. A program that prints the seat numbers in a theater row:
        for (int seat = 1; seat <= 5; seat++) {
            System.out.println("Seat number: " + seat);
        }
//        Seat number: 1
//        Seat number: 2
//        Seat number: 3
//        Seat number: 4
//        Seat number: 5

        // EXAMPLE 5. Use a loop to calculate the factorial of a given number:
        // Factorial means multiplying a number by every number below it, down to 1. For example, the factorial of 5 is: 5 * 4 * 3 * 2 * 1 = 120
        int n = 5;
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " is " + fact);
    }
}
