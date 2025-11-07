// Java this Keyword: The "this keyword" in Java refers to the current object in a method or constructor.

// The "this keyword" is often used to avoid confusion when class attributes have the same name as method or constructor parameters.

// Accessing Class Attributes
// Sometimes a constructor or method has a parameter with the same name as a class variable. When this happens, the parameter temporarily hides the class variable inside that method or constructor.

// To refer to the class variable and not the parameter, you can use the this keyword:

// Calling a Constructor from Another Constructor
//You can also use this() to call another constructor in the same class.
//
//This is useful when you want to provide default values or reuse initialization code instead of repeating it.

//Example

public class ThisKeyword {
    int x;
    public ThisKeyword(int x) {
        this.x = x; // refers to the class variable x
    }

    int modelYear;
    String modelName;


    // Constructor with one parameter
    public ThisKeyword(String modelName) {
        // Call the two-parameter constructor to reuse code and set a default year
        this(2020, modelName);
    }

    // Constructor with two parameters
    public ThisKeyword(int modelYear, String modelName) {
        // Use 'this' to assign values to the class variables
        this.modelYear = modelYear;
        this.modelName = modelName;
    }

    // Method to print car information
    public void printInfo() {
        System.out.println(modelYear + " " + modelName);
    }


    public static void main(String[] args) {
        ThisKeyword myObj = new ThisKeyword(5);
        System.out.println("Value of x = " + myObj.x); // Value of x = 5

        // Create a car with only model name (uses default year)
        ThisKeyword car1 = new ThisKeyword("Corvette");

        // Create a car with both model year and name
        ThisKeyword car2 = new ThisKeyword(1969, "Mustang");

        car1.printInfo();
        car2.printInfo();
    }
}

// Note: The call to this() must be the first statement inside the constructor.
//
//When to use this?
//When a constructor or method has a parameter with the same name as a class variable, use this to update the class variable correctly.
//To call another constructor in the same class and reuse code.