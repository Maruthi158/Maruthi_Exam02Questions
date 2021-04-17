//full time student--sub class
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maruthi_Question4;

/**
 *
 * @author S541905
 */
public class FullTimeStudent extends Student {
    
    private boolean FullTimeStudent;
    private int numberOfCreditHours;

    public FullTimeStudent(boolean FullTimeStudent, int numberOfCreditHours, String firstName, String lastName, String SSN) {
        super(firstName, lastName, SSN);
        this.FullTimeStudent = FullTimeStudent;
        this.numberOfCreditHours = numberOfCreditHours;
    }

    
    public boolean isFullTimeStudent() {
        return FullTimeStudent;
    }

    public void setFullTimeStudent(boolean FullTimeStudent) {
        this.FullTimeStudent = FullTimeStudent;
    }

    public int getNumberOfCreditHours() {
        return numberOfCreditHours;
    }

    public void setNumberOfCreditHours(int numberOfCreditHours) {
        this.numberOfCreditHours = numberOfCreditHours;
    }

    @Override
    public String toString() {
        return super.toString()+"Is FullTimeStudent=" + FullTimeStudent + "\n"+ "numberOfCreditHours=" + numberOfCreditHours;
    }
    
    
}

   