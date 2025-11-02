// Java Class Methods : Methods are declared within a class, and that they are used to perform certain actions:

//Create a method named myMethod() in Main:

// public class Main {
//   static void myMethod() {
//     System.out.println("Hello World!");
//   }
// }


// myMethod() prints a text (the action), when it is called. To call a method, write the method's name followed by two parentheses () and a semicolon;

// Access Methods With an Object


public class ClassMethods {
    static void myMethod() {
        System.out.println("Hello World!");
    }

    // Create a fullThrottle() method
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can!");
    }

    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

    // Inside main, call the methods on the myCar object
    public static void main(String[] args) {
        Main myCar = new Main();     // Create a myCar object
  //      myCar.fullThrottle();      // Call the fullThrottle() method
  //      myCar.speed(200);          // Call the speed() method

        myMethod();
    }
}

// I DON'T UNDERSTAND THIS SIR