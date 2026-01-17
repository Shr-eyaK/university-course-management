
public class Person {

    //Attributes
    protected String name;
    protected String email;

    //Constructor
    public Person (String name,String email){
        this.name = name;
        this.email = email;
    }

    //displays information about Person
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println(" Email: " + email);
    }
}
