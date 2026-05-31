// ProductBillTest.java
public class ProductBillTest {
    public static void main(String[] args) {
        // Create one ProductBill object with a valid price but invalid quantity text
        ProductBill bill = new ProductBill("1500.00", "two");

        try {
            // Call calculateTotal() inside a try block
            double total = bill.calculateTotal();
            System.out.println("Total Bill: " + total);
            
        } catch (NumberFormatException e) {
            // Catching NumberFormatException and printing a simple error message
            System.out.println("Error: Price and quantity must be valid numbers.");
            
            /* * Part C - Short Comment: 
             * This exception occurs because the text "two" cannot be parsed 
             * into a valid integer format by Integer.parseInt().
             */
        } finally {
            // Use a finally block to print completion message
            System.out.println("Product bill calculation completed.");
        }

        // After the try-catch-finally block, print continuation message
        System.out.println("Program continues...");
    }
}
