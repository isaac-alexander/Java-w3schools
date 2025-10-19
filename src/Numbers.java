// Java Numbers
// Primitive number types are divided into two groups:

// Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.

// Floating point types represents numbers with a fractional part, containing one or more decimals. There are two types: float and double.


// Integer Types
// Byte
// The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:

// Short
// The short data type can store whole numbers from -32768 to 32767:

// Int
// The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value

// Long
// The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L":

// Floating Point Types
//You should use a floating point type whenever you need a number with a decimal, such as 9.99 or 3.14515.
// The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles:

// Examples

public class Numbers {
    static void main(String[] args) {
        // Byte Example
        byte myNum = 100;
        System.out.println(myNum);

        // Short Example
        short myNumB = 5000;
        System.out.println(myNumB);

        // Int Example
        int myNumC = 100000;
        System.out.println(myNumC);

        // Long Example
        long myNumD = 15000000000L;
        System.out.println(myNumD);

        // Float Example
        float myNumF = 5.75f;
        System.out.println(myNumF);

        // Double Example
        double myNumG = 19.99d;
        System.out.println(myNumG);

        // Scientific numbers example
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);
    }
}


// Use float or double?
//
//The precision of a floating point value indicates how many digits the value can have after the decimal point. The precision of float is only 6-7 decimal digits, while double variables have a precision of about 16 digits.
//
//Therefore it is safer to use double for most calculations.
//
//Scientific Numbers
//A floating point number can also be a scientific number with an "e" to indicate the power of 10: