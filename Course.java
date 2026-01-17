import java.util.ArrayList;

public class Course {

    //Attributes
    private String courseCode;
    protected String courseName;
    private int creditHour;

    //Aggregation
    private Instructor instructor;

    //ArrayLists for students
    private ArrayList <Student> students;

    //Constructor
    public Course(String courseCode, String courseName, int creditHour, Instructor instructor) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditHour = creditHour;
        this.instructor = instructor;
        this.students = new ArrayList<>();

    }

    //Methods to add and subtract and courses
    public void addStudent(Student s){
        if (!students.contains(s)) {
            students.add(s);
        }
    }

    public void removeStudent(Student s){
        if (!students.contains(s)) {
            students.remove(s);
        }
    }

    public void displayInfo() {
        System.out.println("Course: " + courseCode + " - " + courseName);
        System.out.println("Credit Hours: " + creditHour);
        System.out.println("Instructor: " + instructor.getName());
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.getName() + " (" + s.getStudentId() + ")");
        }
        System.out.println("============================");
    }
}

