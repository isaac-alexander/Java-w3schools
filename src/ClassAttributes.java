// Java Class Attributes
//In the previous chapter, we used the term "variable" for x in the example (as shown below). It is actually an attribute of the class. Or you could say that class attributes are variables within a class:
// Another term for class attributes is fields.

//  Create a class called "Main" with two attributes: x and y:
// public class Main {
//   int x = 5;
//   int y = 3;
// }

// Accessing Attributes
//You can access attributes by creating an object of the class, and by using the dot syntax (.):
//
//The following example will create an object of the Main class, with the name myObj. We use the x attribute on the object to print its value:

// Modify Attributes
//You can also modify attribute values:
// Set the value of y to 40:

// Multiple Objects
//If you create multiple objects of one class, you can change the attribute values in one object, without affecting the attribute values in the other:
//


//Examples
public class ClassAttributes {
    // Create an object called "myObj" and print the value of x:
    int x = 5;
    int y;

    // Change the value of x to 25:

    // Multiple Attributes

    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x); // 5

        myObj.x = 25; // x is now 25
        System.out.println(myObj.x); // 25

        Main myObj2 = new Main();
        myObj2.y = 40;
        System.out.println(myObj2.y);

        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}

// If you don't want the ability to override existing values, declare the attribute as final:
//   final int x = 10;
