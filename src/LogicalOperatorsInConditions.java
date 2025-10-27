// Logical Operators in Conditions
//You can combine or reverse conditions using logical operators. These work together with if, else, and else if to build more complex decisions.

//&& (AND) - all conditions must be true
//|| (OR) - at least one condition must be true
//! (NOT) - reverses a condition (true = false, false = true)



//  EXAMPLES
public class LogicalOperatorsInConditions {
    static void main(String[] args) {
        // AND (&&)
        // Use AND (&&) when both conditions must be true:
        // Test if a is greater than b, and if c is greater than a:
        int a = 200;
        int b = 33;
        int c = 500;

        if (a > b && c > a) {
            System.out.println("Both conditions are true");
        } // Both conditions are true

        // OR (||)
        // Use OR (||) when at least one of the conditions can be true:
        // Test if a is greater than b, or if a is greater than c:

        if (a > b || a > c) {
            System.out.println("At least one condition is true");
        } // At least one condition is true

        // NOT (!)
        //Use NOT (!) to reverse a condition:
        //Test if x is not greater than y:
        int x = 33;
        int y = 200;

        if (!(x > y)) {
            System.out.println("x is NOT greater than y");
        } // x is NOT greater than y


        // Real-Life Example
        //In real programs, logical operators are often used for access control. For example, to get access to a system, there are specific requirements:
        //
        //You must be logged in, and then you either need to be an admin, or have a high security clearance (level 1 or 2):

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
