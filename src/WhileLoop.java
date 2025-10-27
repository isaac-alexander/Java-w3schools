// Loops

// Loops can execute a block of code as long as a specified condition is true.
//Loops are handy because they save time, reduce errors, and they make code more readable.
//Java While Loop
//The while loop repeats a block of code as long as the specified condition is true:

//SYNTAX
// while (condition) {
  // code block to be executed
// }

// EXAMPLES
public class WhileLoop {
    static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // Countdown Example
        // You can also use a while loop to count down. This example counts from 3 to 1, and then prints "Happy New Year!!" at the end:

        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");

        // While Loop With False Condition
        // In the previous examples, the condition was true at the start, so the loop ran one or more times. But if the condition is false at the beginning, the code inside the loop will never run:
        int index = 10;

        while (index < 5) {
            System.out.println("This will never be printed");
            index++;
        }
    }
}

// Note: Do not forget to increase the variable used in the condition (i++), otherwise the loop will never end!
//
//Do you wonder why we used the letter i in the example above? It's a counter variable and a common choice in simple loops because it's short, traditional, and stands for 'index' or 'iterator'.