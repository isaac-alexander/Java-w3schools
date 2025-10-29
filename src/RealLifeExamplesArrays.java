public class RealLifeExamplesArrays {
    static void main(String[] args) {
        // Example 1  create a program that calculates the average of different ages:
        // An array storing different ages
        int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};

        float avg, sum = 0;

        // Get the length of the array
        int length = ages.length;

        // Loop through the elements of the array
        for (int age : ages) {
            sum += age;
        }

        // Calculate the average by dividing the sum by the length
        avg = sum / length;

        // Print the average
        System.out.println("The average age is: " + avg); // The average age is: 40.75

        // Example 2 create a program that finds the lowest age among different ages:

        // An array storing different ages
        int agesB[] = {20, 22, 18, 35, 48, 26, 87, 70};

        // Get the length of the array
        int lengthB = agesB.length;

        // Create a 'lowest age' variable and assign the first array element of ages to it
        int lowestAge = agesB[0];

        // Loop through the elements of the ages array to find the lowest age
        for (int age : agesB) {
            // Check if the current age is smaller than the current 'lowest age'
            if (lowestAge > age) {
                // If the smaller age is found, update 'lowest age' with that element
                lowestAge = age;
            }
        }

        // Output the value of the lowest age
        System.out.println("The lowest age in the array is: " + lowestAge);
        // Output = The lowest age in the array is: 18

        // Example 3 Create a program with a list of numbers where you want to skip negative values, but stop completely if you find a zero:

        int[] numbers = {3, -1, 7, 0, 9};

        for (int n : numbers) {
            if (n < 0) {
                continue; // skip negative numbers
            }
            if (n == 0) {
                break; // stop loop when zero is found
            }
            System.out.println(n);
        } // Output = 3 7

        // Example 4 Create a program that keeps track of the highest and lowest values in an array:
        int[] numbersB = {45, 12, 98, 33, 27};

        int max = numbersB[0];
        int min = numbersB[0];

        for (int n : numbersB) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }

        System.out.println("Max: " + max); // Max: 98
        System.out.println("Min: " + min); // Min: 12

        // Example 5 Create a program that prints the seat numbers in a theater row, showing both the seat number (the index) and who is sitting there (the value):
        String[] seats = {"Jenny", "Liam", "Angie", "Bo"};

        for (int i = 0; i < seats.length; i++) {
            System.out.println("Seat number " + i + " is taken by " + seats[i]);
        } // OUTPUT = Seat number 0 is taken by Jenny
        // Seat number 1 is taken by Liam
        // Seat number 2 is taken by Angie
        // Seat number 3 is taken by Bo
    }
}
