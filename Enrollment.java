import java.util.ArrayList;

public class Enrollment {

    //Attributes
    private Student student;
    private Course course;
    private String grade;

    //Constructor
    public Enrollment(Student student, Course course, String grade) {
        this.student = student;
        this.course = course;
        this.grade = grade;
    }

    public void displayInfo(){
        System.out.println(student.getName() + " enrolled in " + course.courseName + " | Grade: " + grade);
    }

}
