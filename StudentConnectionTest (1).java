/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

import java.sql.Connection;
import java.sql.SQLException;

public class StudentConnectionTest {

    public static void main(String[] args) {

        try (Connection connection =
                     StudentDatabaseConnection.getConnection()) {

            System.out.println("Database connected successfully.");

        } catch (SQLException e) {

            System.out.println("Database error.");
        }
    }
}