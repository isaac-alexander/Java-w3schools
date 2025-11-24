// Non-Access Modifiers: Non-access modifiers do not control visibility (like public or private), but instead add other features to classes, methods, and attributes.
// The most commonly used non-access modifiers are final, static, and abstract.
// Final: If you don't want the ability to override existing attribute values, declare attributes as final:




public class NonAccessModifiers {
        final int x = 10;
        final double PI = 3.14;

        public static void main(String[] args) {
            NonAccessModifiers myObj = new NonAccessModifiers();
//            myObj.x = 50; // will generate an error
//            myObj.PI = 25; // will generate an error
//            System.out.println(myObj.x);
        }
}
