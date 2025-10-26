// The else if Statement
//Use the else if statement to specify a new condition if the first condition is false.

//Syntax
//if (condition1) {
  // block of code to be executed if condition1 is true
//} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
//} else {
  // block of code to be executed if the condition1 is false and condition2 is false
//}



public class ElseIfStatement {
    static void main(String[] args) {
        // If it rains, bring an umbrella. Else if it's sunny, wear sunglasses. Else, just go outside normally.
        int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy

            if (weather == 1) {
                System.out.println("Bring an umbrella.");
            } else if (weather == 2) {
                System.out.println("Wear sunglasses.");
            } else {
                System.out.println("Just go outside normally.");
            } //Wear sunglasses

        // This example chooses between three different messages depending on the time of day:
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        }  else {
            System.out.println("Good evening.");
        } // Good evening

        int clock = 14;
        if (clock < 10) {
            System.out.println("Good morning.");
        } else if (clock < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        } // Good day.
    }
}
//EXAMPLES EXPLAINED
// 1. Since weather is 2, the first condition (weather == 1) is not met, so the if block is skipped. The program then checks the else if condition (weather == 2), which is true. That means the else if block runs and prints "Wear sunglasses.".

// 2. In the example above, time (22) is greater than 10, so the first condition is false. The next condition, in the else if statement, is also false, so we move on to the else condition since condition1 and condition2 is both false - and print to the screen "Good evening".
//
//However, if the time was 14, our program would print "Good day.":

