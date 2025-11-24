// An anonymous class is a class without a name. It is created and used at the same time.
//
//You often use anonymous classes to override methods of an existing class or interface, without writing a separate class file.
//
//Here, we create an anonymous class that extends another class and overrides its method:


public class AnonymousClass {
    // Normal class
        public void makeSound() {
            System.out.println("Animal sound");
        }
}
 class vain {
    public static void main(String[] args) {
        // Anonymous class that overrides makeSound()
        AnonymousClass myAnimal = new AnonymousClass() {
            public void makeSound() {
                System.out.println("Woof woof");
            }
        };

        myAnimal.makeSound();
    }
} // The output will be: Woof woof
// Anonymous Class from an Interface
//You can also use an anonymous class to implement an interface on the fly:
// Interface
//interface Greeting {
//    void sayHello();
//}
//
//public class Main {
//    public static void main(String[] args) {
//        // Anonymous class that implements Greeting
//        Greeting greet = new Greeting() {
//            public void sayHello() {
//                System.out.println("Hello, World!");
//            }
//        };
//
//        greet.sayHello();
//    }
//}