//ElectronicsDriver.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maruthiQuestion8;

/**
 *
 * @author S541905
 */
public class ElectronicsDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The answer for Question 8 as follows by Priyanka Maruthi ");
        Refrigerator R1=new Refrigerator(1,"Grey");
        System.out.println(R1);
        System.out.println("Invoking abstract method on Refrigerator class");
        System.out.println(R1.typeOfElectronicGoods());
        TV T1=new TV(2,"Green");
        System.out.println(T1);
        System.out.println("Invoking abstract method on TV class");
        System.out.println(T1.typeOfElectronicGoods());
        
    }
    
}
