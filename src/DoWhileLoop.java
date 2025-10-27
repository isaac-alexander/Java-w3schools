// Java Do/While Loop
// The Do/While Loop
//The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true. Then it will repeat the loop as long as the condition is true.

// Syntax
//do {
  // code block to be executed
//}
//while (condition);

// Note: The semicolon ; after the while condition is required!
// Do not forget to increase the variable used in the condition (i++), otherwise the loop will never end!


public class DoWhileLoop {
    static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);

        // Condition is False from the Start
        int iterator = 10;
        do {
            System.out.println("iterator is " + iterator);
            iterator++;
        } while (iterator < 5);
    }
}

// Condition is False from the Start
//In the while loop chapter, we saw that if the condition is false at the beginning, the loop never runs at all.
//
//The do/while loop is different: it will always run the code block at least once, even if the condition is false from the start.
//
//In the example below, the variable i starts at 10, so i < 5 is false immediately. Still, the loop runs once before checking the condition:

// Summary: A do/while loop always runs at least once, even if the condition is false at the start. This is the key difference from a while loop, which would skip the code block completely in the same situation.
//
//This behavior makes do/while useful when you want something to happen at least once, such as showing a message or asking the user for input.