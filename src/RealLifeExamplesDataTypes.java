// Here's a real-life example of using different data types, to calculate and output the total cost of a number of items:


public class RealLifeExamplesDataTypes {
    public static void main(String[] args) {
        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
    }
}
