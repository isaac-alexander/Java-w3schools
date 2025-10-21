// Logical Operators

// As with comparison operators, you can also test for true or false values with logical operators.

// Logical operators are used to determine the logic between variables or values, by combining multiple conditions::


// Operator - Name - Description - Example
// && - Logical and	- Returns true if both statements are true - x < 5 &&  x < 10
// || - Logical or - Returns true if one of the statements is true - x < 5 || x < 4
// ! - Logical not - Reverse the result, returns false if the result is true - !(x < 5 && x < 10)


// Real-Life Example: Login Check

// The example below shows how logical operators can be used in a real situation, e.g. when checking login status and access rights:

public class LogicalOperators {
    static void main(String[] args) {
        boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: " + (!isLoggedIn));
    }
}
