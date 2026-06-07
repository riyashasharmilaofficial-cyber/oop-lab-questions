/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

public class StudentSearchUpdateMain {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        dao.findStudentById(1);

        dao.updateStudentMark(1, 95);

        dao.findStudentById(1);
    }
}