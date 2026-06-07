/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

public class StudentInsertMain {

    public static void main(String[] args) {

        Student student =
                new Student(10, "Nimal Perera", 82);

        StudentDAO dao = new StudentDAO();

        dao.addStudent(student);
    }
}