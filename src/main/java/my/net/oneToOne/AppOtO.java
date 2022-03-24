package my.net.oneToOne;

import my.net.oneToOne.entity.*;
import my.net.oneToOne.dao.*;

public class AppOtO {
    public static void main(String[] args) {

        Instructor instructor = new Instructor("Ramesh", "Fadatare", "ramesh@javaguides.com");
        InstructorDetail instructorDetail = new InstructorDetail("http://www.youtube.com", "Guitar");
        instructor.setInstructorDetail(instructorDetail);

        InstructorDAO instructorDao = new InstructorDAO();
        instructorDao.saveInstructor(instructor);
    }
}