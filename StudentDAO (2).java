/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

import Q3.StudentDatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class StudentDAO {

    public void addStudent(Q3.Student student) {

        String sql =
                "INSERT INTO students(student_id, student_name, mark) VALUES(?,?,?)";

        try (
                Connection connection =
                        StudentDatabaseConnection.getConnection();

                PreparedStatement statement =
                        connection.prepareStatement(sql)
        ) {

            statement.setInt(1, student.getStudentId());
            statement.setString(2, student.getStudentName());
            statement.setInt(3, student.getMark());

            statement.executeUpdate();

            System.out.println("Student added successfully.");

        } catch (SQLException e) {

            System.out.println("Database error.");
        }
    }
    public void displayAllStudents() {

    String sql =
            "SELECT student_id, student_name, mark FROM students";

    try (
            Connection connection =
                    StudentDatabaseConnection.getConnection();

            PreparedStatement statement =
                    connection.prepareStatement(sql);

            ResultSet resultSet =
                    statement.executeQuery()
    ) {

        while (resultSet.next()) {

            System.out.println(
                    resultSet.getInt("student_id")
                            + " "
                            + resultSet.getString("student_name")
                            + " "
                            + resultSet.getInt("mark")
            );
        }

    } catch (SQLException e) {

        System.out.println("Database error.");
    }
}
    public void findStudentById(int studentId) {

    String sql =
            "SELECT student_id, student_name, mark FROM students WHERE student_id = ?";

    try (
            Connection connection =
                    StudentDatabaseConnection.getConnection();

            PreparedStatement statement =
                    connection.prepareStatement(sql)
    ) {

        statement.setInt(1, studentId);

        ResultSet resultSet =
                statement.executeQuery();

        if (resultSet.next()) {

            System.out.println(
                    resultSet.getInt("student_id")
                            + " "
                            + resultSet.getString("student_name")
                            + " "
                            + resultSet.getInt("mark")
            );

        } else {

            System.out.println("Student not found.");
        }

    } catch (SQLException e) {

        System.out.println("Database error.");
    }
}
    public void updateStudentMark(int studentId,
                              int newMark) {

    String sql =
            "UPDATE students SET mark = ? WHERE student_id = ?";

    try (
            Connection connection =
                    StudentDatabaseConnection.getConnection();

            PreparedStatement statement =
                    connection.prepareStatement(sql)
    ) {

        statement.setInt(1, newMark);
        statement.setInt(2, studentId);

        int rowsUpdated =
                statement.executeUpdate();

        if (rowsUpdated > 0) {

            System.out.println(
                    "Student mark updated successfully.");
        } else {

            System.out.println(
                    "Student not found. Mark not updated.");
        }

    } catch (SQLException e) {

        System.out.println("Database error.");
    }
}
}