// Identifiers
// All Java variables must be identified with unique names.
//These unique names are called identifiers.
//Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
//Note: It is recommended to use descriptive names in order to create understandable and maintainable code:

// The general rules for naming variables are:
// Names can contain letters, digits, underscores, and dollar signs
// Names must begin with a letter
// Names should start with lowercase letter, and cannot contain whitespace
// Names can also begin with $ and _
// Names are case-sensitive ("myVar" and "myvar" are different variables)
// Reserved words (like Java keywords, such as int or boolean) cannot be used as names

public class Identifiers {
    public static void main(String[] args) {
        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;

        System.out.println(minutesPerHour);
        System.out.println(m);
    }
}

// Invalid Identifiers
// Here are some examples of invalid identifiers that would cause errors:

//Example
// Invalid identifiers:
// int 2ndNumber = 5;  // Cannot start with a digit
// int my var = 10;    // Cannot contain spaces
// int int = 20;       // Cannot use reserved keyword