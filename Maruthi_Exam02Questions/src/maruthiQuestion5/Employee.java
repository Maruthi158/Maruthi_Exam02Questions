//Employee.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maruthiQuestion5;

/**
 *
 * @author  Priyanka Maruthi
 */
public class Employee extends Person {
    private String office;
    private double salary;
    private String dateHired;

    public Employee(String office, double salary, String dateHired, String name, String address, String phoneNumber, String emailAddress) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee Class\n" +"Person name : "+super.getName()+"\noffice : " + office + "\n salary : " + salary + "\ndateHired :" + dateHired ;
    }
    
    
}
