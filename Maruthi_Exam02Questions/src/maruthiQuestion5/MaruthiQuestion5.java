//MaruthiQuestion5.java
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
public class MaruthiQuestion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The answer for Question5 as follows by Priyanka Maruthi");
        Person P1=new Person("Priyanka","1121 N College Drive","8728065785","maruthipriyanka1011@gmail.com");
        System.out.println(P1);
        Student S1=new Student("A","Priyanka","1121 N College Drive","8728065785","maruthipriyanka1011@gmail.com");
        System.out.println("*************************************************");
        System.out.println(S1);
        System.out.println("*************************************************");
        Employee E1=new Employee("ARMARK",345.60,"04/15/2021","Priyanka","1121 N College Drive","8728065785","maruthipriyanka1011@gmail.com");
        System.out.println(E1);
        System.out.println("*************************************************");
        Faculty F1=new Faculty(20,10,"ARMARK",345.60,"04/15/2021","Priyanka","1121 N College Drive","8728065785","maruthipriyanka1011@gmail.com");
         System.out.println(F1);
        System.out.println("*************************************************");
         Staff Staff=new Staff("assistant","ARMARK",345.60,"04/15/2021","Priyanka","1121 N College Drive","8728065785","maruthipriyanka1011@gmail.com");
         System.out.println(Staff);
        System.out.println("*************************************************");
    }
    
}
