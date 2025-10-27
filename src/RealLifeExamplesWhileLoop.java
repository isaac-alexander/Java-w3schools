// Real-Life Examples

public class RealLifeExamplesWhileLoop {
    static void main(String[] args) {
        // A "countdown" program:
        int countdown = 3;

        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }

        System.out.println("Happy New Year!!");
//        OUTPUT 3
              // 2
              // 1
              // Happy New Year!!

        // To demonstrate a practical example of the while loop combined with an if else statement, let's say we play a game of Yatzy:
        // Print "Yatzy!" If the dice number is 6:
        int dice = 1;

        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }
        // OUTPUT No Yatzy.
                //No Yatzy.
                //No Yatzy.
                //No Yatzy.
                //No Yatzy.
                //Yatzy!
    }
}
// If the loop passes the values ranging from 1 to 5, it prints "No Yatzy". Whenever it passes the value 6, it prints "Yatzy!".
