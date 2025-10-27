// Real-Life Examples



public class RealLifeExamplesIfElse {
    public static void main(String[] args) {
        //EXAMPLE 1. This example shows how you can use if..else to "open a door" if the user enters the correct code:
        int doorCode = 1337;

        if (doorCode == 1337) {
            System.out.println("Correct code. The door is now open.");
        } else {
            System.out.println("Wrong code. The door remains closed.");
        }
        //OUTPUT Correct code. The door is now open.

        //EXAMPLE 2. This example shows how you can use if..else to find out if a number is positive or negative:
        int myNum = 10; // Is this a positive or negative number?

        if (myNum > 0) {
            System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
            System.out.println("The value is a negative number.");
        } else {
            System.out.println("The value is 0.");
        }
        // OUTPUT The value is a positive number.

        //EXAMPLE 3. Find out if a person is old enough to vote:
        int myAge = 25;
        int votingAge = 18;

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
        // OUTPUT Old enough to vote!

        //EXAMPLE 4. Find out if a person is old enough to vote, and if they are a citizen (using nested if statements):
        int age = 20;
        boolean isCitizen = true;

        if (age >= 18) {
            System.out.println("Old enough to vote.");

            if (isCitizen) {
                System.out.println("And you are a citizen, so you can vote!");
            } else {
                System.out.println("But you must be a citizen to vote.");
            }
        } else {
            System.out.println("Not old enough to vote.");
        }
        // OUTPUT Old enough to vote.
        //And you are a citizen, so you can vote!

        // EXAMPLE 5. Find out if a number is even or odd:
        int myNumB = 5;

        if (myNumB % 2 == 0) {
            System.out.println(myNumB + " is even");
        } else {
            System.out.println(myNumB + " is odd");
        }
        // OUTPUT 5 is odd

        //EXAMPLE 6. Check temperature:
        int temperature = 30;

        if (temperature < 0) {
            System.out.println("It's freezing!");
        } else if (temperature < 20) {
            System.out.println("It's cool.");
        } else {
            System.out.println("It's warm.");
        }

        //EXAMPLE 7. System access control example - You must be logged in, and then you either need to be an admin, or have a high security clearance (level 1 or 2) to get access:
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        int securityLevel = 3; // 1 = highest

        if (isLoggedIn && (isAdmin || securityLevel <= 2)) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        // Try changing securityLevel to test different outcomes:
        // securityLevel 1 = Access granted
        // securityLevel 2 = Access granted
        // securityLevel 3 = Access denied
        // securityLevel 4 = Access denied
        // If isAdmin = true, access is granted.

    }
}
