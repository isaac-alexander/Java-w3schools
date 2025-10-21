// Comparison Operators

// Comparison operators are used to compare two values (or variables). This is important in programming, because it helps us  find answers and make decisions.

//The return value of a comparison is either true or false. These values are known as Boolean values

// In the following example, we use the greater than operator (>) to find out if 5 is greater than 3:

// Real-Life Examples
//Comparison operators are often used in real-world conditions, such as checking if a person is old enough to vote:

// EXAMPLES

public class ComparisonOperators {
    static void main(String[] args) {
        int x = 5;
        int y = 3;
        System.out.println(x > y); // returns true, because 5 is higher than 3

        // Real-Life Examples
        //checking if a person is old enough to vote
        int age = 18;

        System.out.println(age >= 18); // true, old enough to vote
        System.out.println(age < 18);  // false, not old enough

        //Checking if a password is long enough:
        int passwordLength = 5;

        System.out.println(passwordLength >= 8); // false, too short
        System.out.println(passwordLength < 8);  // true, needs more characters
    }
}

// A list of all comparison operators:

// Operator    Name           Example
// ==        Equal to         x == y
// !=        Not equal        x != y
// >         Greater than     x > y
// <         Less than        x < y
// >=        Greater than or equal to	x >= y
// <=         Less than or equal to	x <= y