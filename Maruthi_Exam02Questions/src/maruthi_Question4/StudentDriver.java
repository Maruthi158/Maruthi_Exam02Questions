//StudentDriver.java
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
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The answer for Question4 as follows by Priyanka Maruthi");
        System.out.println("Base class:Parent student");
        Student stu1 = new Student("Priyanka", "Maruthi", "123-33-5432");
        System.out.println(stu1);
        
        System.out.println("child class:Fulltimestudent");
        FullTimeStudent stu2 = new FullTimeStudent(Boolean.FALSE,3,"Jethin", "Yadav", "123-33-5492");
        System.out.println(stu2); 
        //POLYMORPHISM--POLYMORPHIC SUBSTITUTION
        System.out.println("POLYMORPHISM--POLYMORPHIC SUBSTITUTION &late binding polyphorism");
        Student stu3=new FullTimeStudent(Boolean.TRUE,3,"Upendran", "Rajendran", "865-33-5492");
        System.out.println(stu3); 
    }
    
}
