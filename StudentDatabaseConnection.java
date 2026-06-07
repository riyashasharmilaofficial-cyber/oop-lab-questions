/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDatabaseConnection {
    // Database configuration constants
    private static final String URL = "jdbc:mysql://localhost:3306/oop_lab_08";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root"; // Empty password for local lab setup

    // Static method to establish and return a database connection
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
