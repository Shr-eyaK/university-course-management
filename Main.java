import java.util.ArrayList;

public static void main(String[] args) {

    // Create Department
    Department csDept = new Department("Computer Science");

    // Create Instructors
    Instructor i1 = new Instructor("Dr. Taylor", "taylor@ontariotechu.ca", "Sotware  Engineering");

    Instructor i2 = new Instructor("Prof. White", "white@ontariotechu.ca", "Electrical  Engineering");

    // Add Instructors to Department
    csDept.addInstructor(i1);
    csDept.addInstructor(i2);

    // Create Courses
        Course c1 = new Course("CS101", "Intro to Programming", 3, i1);
        Course c2 = new Course("CS201", "Data Structures", 4, i2);

    // Add Courses to Department
        csDept.addCourse(c1);
        csDept.addCourse(c2);

    // Create Students
        Student s1 = new Student("Alice", "alice@student.edu", "S001");
        Student s2 = new Student("Bob", "bob@student.edu", "S002");
        Student s3 = new Student("Charlie", "charlie@student.edu", "S003");

    // Enroll Students
        c1.addStudent(s1);
        c1.addStudent(s2);
        c2.addStudent(s2);
        c2.addStudent(s3);

    // Display Department Info
        System.out.println("=== Department Information ===");
        csDept.displayInfo();

    // Display Course Information
        System.out.println("=== Course Details ===");
        c1.displayInfo();
        c2.displayInfo();


    // Create and Display Enrollment Information
        System.out.println("=== Enrollment Records ===");
        Enrollment e1 = new Enrollment(s1, c1, "A");
        Enrollment e2 = new Enrollment(s2, c1, "B+");
        Enrollment e3 = new Enrollment(s3, c2, "A-");
        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();

}