import java.util.ArrayList;

public class Department {

    //Attribute
    private String departmentName;

    //ArrayLists for instructors and courses
    private ArrayList<Instructor> instructors;
    private ArrayList<Course> courses;

    //Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.instructors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    //Methods to add instructors and courses
    public void addInstructor(Instructor i) {
        if (!instructors.contains(i)) instructors.add(i);
    }

    public void addCourse(Course c) {
        if (!courses.contains(c)) courses.add(c);
    }

    public void displayInfo() {
        System.out.println("Department: " + departmentName);
        System.out.println("Instructors:");
        for (Instructor i : instructors) {
            System.out.println(" - " + i.name);
        }
        System.out.println();
        System.out.println("Courses Offered:");
        for (Course c : courses) {
            System.out.println(" - " + c.courseName);
        }
        System.out.println("============================");
    }
}
