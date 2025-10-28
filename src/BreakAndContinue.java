// Break : The break statement can also be used to jump out of a loop.

// Continue : The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.



// EXAMPLES
public class BreakAndContinue {
    static void main(String[] args) {
        //BREAK
        // This example stops the loop when i is equal to 4:
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        } // OUTPUT 0 1 2 3
        // break = stop the loop completely.

        // CONTINUE
        // This example skips the value of 4:
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i); //OUTPUT = 0 1 2 3 5 6 7 8 9
        }
        //continue = skip this round, but keep looping.

        // Combining Break and Continue
        // This example skips printing 2 and stops the loop at 4:
        for (int i = 0; i < 6; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break;
            }
            System.out.println(i); // OUTPUT 0 1 3
        }

        // Break and Continue in While Loop
        // BREAK EXAMPLE
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            } // OUTPUT = 0 1 2 3
        }

        // CONTINUE EXAMPLE
        int index = 0;
        while (index < 10) {
            if (index == 4) {
                index++;
                continue;
            }
            System.out.println(index);
            index++;
        } // OUTPUT 0 1 2 3 5 6 7 8 9

        // REAL LIFE EXAMPLES
        // Processing a list of numbers where you want to skip negative values, but stop completely if you find a zero:
        int[] numbers = {3, -1, 7, 0, 9};

        for (int n : numbers) {
            if (n < 0) {
                continue; // skip negative numbers
            }
            if (n == 0) {
                break; // stop loop when zero is found
            }
            System.out.println(n); // OUTPUT = 3 7
        }
    }
}
