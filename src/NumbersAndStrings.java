// Adding Numbers and Strings

//WARNING! - Java uses the + operator for both addition and concatenation.

//Numbers are added. Strings are concatenated.


// EXAMPLES

public class NumbersAndStrings {
    static void main(String[] args) {
        //If you add two numbers, the result will be a number:
        int x = 10;
        int y = 20;
        int z = x  + y;
        System.out.println(z); // 30

        // If you add two strings, the result will be a string concatenation:
        String a = "10";
        String b = "20";
        String c = a + b;
        System.out.println(c); // 1020

        // If you add a number and a string, the result will be a string concatenation:
        String e = "10";
        int f = 20;
        String g = e + f;
        System.out.println(g); // 1020
    }
}
