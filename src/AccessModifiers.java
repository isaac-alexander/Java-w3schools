// The public keyword is an access modifier, meaning that it is used to set the access level for classes, attributes, methods and constructors.
//
//We divide modifiers into two groups:
//
//Access Modifiers - controls the access level
//Non-Access Modifiers - do not control access level, but provides other functionality

// Access Modifiers
//For classes, you can use either public or default:
//
// Modifier	Description
// public	The class is accessible by any other class
// default	The class is only accessible by classes in the same package. This is used when you don't specify a modifier

// For attributes, methods and constructors, you can use the one of the following:
// Modifier	Description
// public	The code is accessible for all classes
// private	The code is only accessible within the declared class
// default	The code is only accessible in the same package. This is used when you don't specify a modifier
// protected The code is accessible in the same package and subclasses.



// Public vs. Private Example
//In the example below, the class has one public attribute and one private attribute.
//
//Think of it like real life:
//
//public - a public park, everyone can enter
//private - your house key, only you can use it


public class AccessModifiers {
//    class Person {
//        public String name = "John";   // Public - accessible everywhere
//        private int age = 30;          // Private - only accessible inside this class
//    }
//
//    public class Main {
//        public static void main(String[] args) {
//            Person p = new Person();
//            System.out.println(p.name);   // Works fine
//            System.out.println(p.age);    // Error: age has private access in Person
//        }
//    }
}

// Example explained
//Here, name is declared as public, so it can be accessed from outside the Person class. But age is declared as private, so it can only be used inside the Person class.