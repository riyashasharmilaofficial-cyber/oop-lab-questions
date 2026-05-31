// StudentMarkReport.java
public class StudentMarkReport {
    // Requirements: use private for the array attribute (Part A)
    private String[] marks;

    // Constructor to initialize the array
    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }

    // Method to get a mark at a specific index and convert to an integer
    public int getMarkAt(int index) {
        String selectedMarkText = marks[index];
        return Integer.parseInt(selectedMarkText);
    }
}
