//Faculty.java
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
public class Faculty extends Employee{
    private int officeHours;
    private int numberOfTeaching;

    public Faculty(int officeHours, int numberOfTeaching, String office, double salary, String dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.officeHours = officeHours;
        this.numberOfTeaching = numberOfTeaching;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public int getNumberOfTeaching() {
        return numberOfTeaching;
    }

    public void setNumberOfTeaching(int numberOfTeaching) {
        this.numberOfTeaching = numberOfTeaching;
    }

    @Override
    public String toString() {
        return "Faculty Class\n" +"Person name : "+super.getName()+ "\nofficeHours : " + officeHours + "\nnumberOfTeaching=" + numberOfTeaching ;
    }
    
}
