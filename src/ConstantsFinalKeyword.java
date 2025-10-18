// Constants (final keyword)
// When you do not want a variable's value to change, use the final keyword.
// A variable declared with final becomes a constant, which means unchangeable and read-only:

// When to Use final?
// You should declare variables as final when their values should never change. For example, the number of minutes in an hour, or your birth year:
// Example

public class ConstantsFinalKeyword {
    public static void main(String[] args) {
        final int myNum = 15;
        // myNum = 20; // will generate an error
        System.out.println(myNum);

        final int MINUTES_PER_HOUR = 60;
        final int BIRTHYEAR = 1980;
        System.out.println(MINUTES_PER_HOUR);
        System.out.println(BIRTHYEAR);
    }
}

// Note: By convention, final variables in Java are usually written in upper case (e.g. BIRTHYEAR). It is not required, but useful for code readability and common for many programmers.