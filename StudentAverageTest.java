// StudentAverageTest.java
public class StudentAverageTest {
    public static void main(String[] args) {
        // Create one StudentAverageCalculator object with 0 as the number of students
        StudentAverageCalculator calculator = new StudentAverageCalculator(500, 0);

        try {
            // Call calculateAverage() inside a try block
            int average = calculator.calculateAverage();
            System.out.println("Average Mark: " + average);
            
        } catch (ArithmeticException e) {
            // Catching ArithmeticException and printing a simple error message
            System.out.println("Error: Number of students cannot be zero.");
            
            /* * Part C - Short Comment: 
             * This exception occurs because the program attempts an integer division 
             * by zero (totalMarks / 0), which is mathematically undefined in Java.
             */
        } finally {
            // Use a finally block to print the completion message
            System.out.println("Average calculation completed.");
        }

        // After the try-catch-finally block, print continuation message
        System.out.println("Program continues...");
    }
}