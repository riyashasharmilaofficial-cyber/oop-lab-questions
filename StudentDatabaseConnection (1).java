/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDatabaseConnection {

    private static final String URL =
            "jdbc:mysql://localhost:3306/oop_lab_08";

    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}