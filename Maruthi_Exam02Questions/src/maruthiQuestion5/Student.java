//Student.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maruthiQuestion5;

/**
 *
 * @author Priyanka Maruthi
 */
public class Student extends Person {
    private String grade ;
    public static final String classStatus="Graduate";

    public Student(String grade, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student Class \n" +"Person name :"+super.getName()+ "\ngrade :" + grade ;
    }
    
    
}
