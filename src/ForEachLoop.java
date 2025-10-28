// The for-each Loop
//There is also a "for-each" loop, which is used exclusively to loop through elements in an array (or other data structures):

// Syntax
// for (type variableName : arrayName) {
//  // code block to be executed
//}

// The for-each loop is simpler and more readable than a regular for loop, since you don't need a counter (like i < array.length).


//EXAMPLES
public class ForEachLoop {
    public static void main(String[] args) {
        // The following example prints all elements in the cars array:
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (String car : cars) {
            System.out.println(car);
        } // OUTPUT = Volvo BMW Ford Mazda

        // Here is a similar example with numbers. We create an array of integers and use a for-each loop to print each value:
        int[] numbers = {10, 20, 30, 40};

        for (int num : numbers) {
            System.out.println(num);
        } // OUTPUT = 10 20 30 40
    }
}
