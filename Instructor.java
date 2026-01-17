import java.util.ArrayList;

public class Instructor extends Person{

    //Attributes
    private String departmentName;

    //Constructor
    public Instructor(String name, String email, String departmentName) {
        super(name, email);
        this.departmentName = departmentName;
    }

    //Getter
    public String getDepartmentname() {
        return departmentName;
    }

    public String getName() {
        return name;
    }

    //displays information about Instrcutor
    @Override
    public void displayInfo() {
        System.out.println("Instructor: " + name + " | Department: " + departmentName);
    }
}
