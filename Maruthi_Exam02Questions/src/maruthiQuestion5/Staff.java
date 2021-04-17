//Staff.java
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
public class Staff extends Employee{
    private String title;

    public Staff(String title, String office, double salary, String dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(office, salary, dateHired, name, address, phoneNumber, emailAddress);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff Class"  +"Person name : "+super.getName()+ "\n title=" + title ;
    }
    
    
    
}
