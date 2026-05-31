// StudentMarkReportTest.java
public class StudentMarkReportTest {
    public static void main(String[] args) {
        // Part B: Create a String array with specified values
        String[] marks = {"78", "82", "absent", "90"};
        
        // Create a StudentMarkReport object
        StudentMarkReport report = new StudentMarkReport(marks);

        // --- Part B: Test an Invalid Array Index ---
        try {
            // Call getMarkAt(6) which is out of bounds for an array of size 4
            int mark1 = report.getMarkAt(6);
            System.out.println("Mark at index 6: " + mark1);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Selected mark position does not exist.");
            
            /* * Part D - Short Comment 1: 
             * getMarkAt(6) causes an exception because index 6 is beyond 
             * the valid index boundaries (0 to 3) of the marks array.
             */
        } finally {
            System.out.println("Array access checking completed.");
        }

        // --- Part C: Test an Invalid Number Format ---
        try {
            // Call getMarkAt(2) which contains the text string "absent"
            int mark2 = report.getMarkAt(2);
            System.out.println("Mark at index 2: " + mark2);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Selected mark is not a valid number.");
            
            /* * Part D - Short Comment 2: 
             * getMarkAt(2) causes an exception because the array element contains 
             * the alphabetical text "absent", which cannot be converted to an integer.
             */
        } finally {
            System.out.println("Number conversion checking completed.");
        }

        // After both blocks are executed, print final tracking message
        System.out.println("Report checking completed.");
    }
}
