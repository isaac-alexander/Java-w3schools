// Create an Object
//In Java, an object is created from a class. We have already created the class named Main, so now we can use this to create objects.
//
//To create an object of Main, specify the class name, followed by the object name, and use the keyword new:


public class Main {
    // Create an object called "myObj" and print the value of x:
    int x = 5;
    int y;

    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.x); // 5

        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}
