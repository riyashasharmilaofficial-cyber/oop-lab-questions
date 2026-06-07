

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Question 1 - Part B: Handles creating and returning the database connection.
 */
public class StudentDatabaseConnection {
    
    // Define database connection constants
    private static final String URL = "jdbc:mysql://localhost:3306/oop_lab_08";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root"; // Empty password for local lab setup

    /**
     * Static method that returns an active Connection object.
     * @return Connection object to oop_lab_08 database
     * @throws SQLException if a database access error occurs
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
