// Declare Many Variables
//To declare more than one variable of the same type, you can use a comma-separated list:

public class DeclareMultipleVariables {
    static void main(String[] args) {
        //Example //Instead of writing:
        int x = 5;
        int y = 6;
        int z = 50;
        System.out.println(x + y + z); // 61
        // You can write:

        int x2 = 5, y2 = 6, z2 = 50;
        System.out.println(x2 + y2 + z2); // 61

        // One Value to Multiple Variables
        // You can also assign the same value to multiple variables in one line:
        // Example

        int a, b, c;
        a = b = c = 50;
        System.out.println(a + b + c); // 150
    }
}
