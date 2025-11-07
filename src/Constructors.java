// Java Constructors : A constructor in Java is a special method that is used to initialize objects.
//The constructor is called when an object of a class is created.
//It can be used to set initial values for object attributes:

// Constructor Parameters
// Constructors can also take parameters, which is used to initialize attributes.

// The following example adds an int y parameter to the constructor. Inside the constructor we set x to y (x=y). When we call the constructor, we pass a parameter to the constructor (5), which will set the value of x to 5:



public class Constructors {
    int x;

    int modelYear;
    String modelName;

    // Create a class constructor for the Constructor class
    public Constructors() {
        x = 5;
    }

    // Constructor Parameters
    // You can have as many parameters as you want:
    public Constructors(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constructors myObj = new Constructors();
        System.out.println(myObj.x); // 5

        Constructors myCar = new Constructors(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName); // 1969 Mustang
    }
}


// Note that the constructor name must match the class name, and it cannot have a return type (like void).
//
//Also note that the constructor is called when the object is created.
//
//All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.