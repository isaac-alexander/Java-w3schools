// Multidimensional Arrays : A multidimensional array is an array that contains other arrays.

// You can use it to store data in a table with rows and columns.

//To create a two-dimensional array, write each row inside its own curly braces
// int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };

// Here, myNumbers has two arrays (two rows):

// First row: {1, 4, 2}
// Second row: {3, 6, 8}

// Access Elements
// To access an element of a two-dimensional array, you need two indexes: the first for the row, and the second for the column.

// Remember: Array indexes start at 0. That means row 0 is the first row, and column 0 is the first column. (So row index 1 is the second row, and column index 2 is the third column.)

// This statement accesses the element in the second row (index 1) and third column (index 2) of the myNumbers array:


// EXAMPLES

public class MultiDimensionalArray {
    // This statement accesses the element in the second row (index 1) and third column (index 2) of the myNumbers array. Example 2 prints the value at row 0, column 1

    static void main(String[] args) {
        int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
        //example1
        System.out.println(myNumbers[1][2]); // OUTPUT = 8
        //example1
        System.out.println(myNumbers[0][1]); // OUTPUT = 4

        // Change Element Values
        //You can overwrite an existing element using the same two-index notation (row, then column):
        int[][] myNumbers2 = { {1, 4, 2}, {3, 6, 8} };
        myNumbers2[1][2] = 9;
        System.out.println(myNumbers2[1][2]); // Outputs 9 instead of 8

        // Rows and Columns (Lengths)
        //You can use length to get the number of rows, and myNumbers[row].length for the number of columns in a given row:

        int[][] myNumbers3 = { {1, 4, 2}, {3, 6, 8, 5, 2} };

        System.out.println("Rows: " + myNumbers3.length); // Rows: 2
        System.out.println("Cols in row 0: " + myNumbers3[0].length); // Cols in row 0: 3
        System.out.println("Cols in row 1: " + myNumbers3[1].length); // Cols in row 1: 5

        // Loop Through a Multidimensional Array
        // Use a for loop inside another for loop to visit every element (row by row):
        int[][] myNumbers4 = { {1, 4, 2}, {3, 6, 8, 5, 2} };

        for (int row = 0; row < myNumbers4.length; row++) {
            for (int col = 0; col < myNumbers4[row].length; col++) {
                System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers4[row][col]);
            }
        }

        // Or use a for-each loop in both levels, which many find easier to read:
        int[][] myNumbers5 = { {1, 4, 2}, {3, 6, 8, 5, 2} };

        for (int[] row : myNumbers5) {
            for (int num : row) {
                System.out.println(num);
            }
        }
    }
}
