import java.util.ArrayList;
import java.util.Date;

public class Student {

    private String name;
    private String lastName;
    private String birthDate;
    private String email;
    private String address;
    private String phoneNumber;
    private String indexNumber;
    



    static ArrayList<Student>students= new ArrayList<Student>();

    public Student(String name, String lastName, String birthDate, String email, String address, String phoneNumber) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;

        Student.students.add(this);
        this.indexNumber= "s" + students.size();
    }








}
