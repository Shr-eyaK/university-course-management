import java.util.ArrayList;

public class Student extends Person {

    //Attributes
    private String studentId;

    //Constructor
    public Student(String name, String email, String studentId){
        super(name,email);
        this.studentId = studentId;
    }

    //Getter
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    //displays information about Student
    @Override
    public void displayInfo(){
        System.out.println(name + " (" + studentId + ")");
    }
}
