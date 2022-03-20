package my.net.hibernate;

import my.net.hibernate.dao.StudentDAO;
import my.net.hibernate.entity.Student;

import java.util.List;

public class App {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        Student student = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
        studentDAO.saveStudent(student);
        List <Student> students = studentDAO.getStudents();
        students.forEach(s-> System.out.println(s.getName()));
    }
}
