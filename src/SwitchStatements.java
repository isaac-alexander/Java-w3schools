// Java Switch Statement
// Instead of writing many if..else statements, you can use the switch statement.
//Think of it like ordering food in a restaurant: If you choose number 1, you get Pizza. If you choose 2, you get a Burger. If you choose 3, you get Pasta. Otherwise, you get nothing.
//The switch statement selects one of many code blocks to be executed:

// Syntax
//switch(expression) {
//  case x:
    // code block
//    break;
//  case y:
    // code block
//    break;
//  default:
    // code block
//}

// This is how it works:

// The switch expression is evaluated once.
// The result is compared with each case value.
// If there is a match, the matching block of code runs.
// The break statement stops the switch after the matching case has run.
// The default statement runs if there is no match.


// EXAMPLE
public class SwitchStatements {
    static void main(String[] args) {
        // The example below uses the weekday number to calculate the weekday name:
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        // Outputs "Thursday" (day 4)

        int day2 = 4;
        switch (day2) {
            case 8:
                System.out.println("Today is Saturday");
                break;
            case 9:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }
        // OUTPUT =  Looking forward to the Weekend
    }
}
// The break Keyword
//When Java reaches a break keyword, it breaks out of the switch block.
//
//This will stop the execution of more code and case testing inside the block.
//
//When a match is found, and the job is done, it's time for a break. There is no need for more testing.

// The default Keyword
//The default keyword specifies some code to run if there is no case match: