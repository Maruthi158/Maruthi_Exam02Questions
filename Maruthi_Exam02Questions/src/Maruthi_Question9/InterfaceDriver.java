//InterfaceDriver.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maruthi_Question9;

/**
 *
 * 
 * @author S541905
 */
public class InterfaceDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The answer for Question 9 as follows");
        WashingMachine w1=new WashingMachine(10,"yellow",20.0);
        System.out.println("to string for WashingMachine");
        System.out.println(w1);
        System.out.println("Invoking abstract method:typeOfElectronicGoods using WashingMachine object");
        System.out.println(w1.typeOfElectronicGoods());
        System.out.println("Invoking default method:isPowerSupplyRequired using WashingMachine object");
        System.out.println(w1.isPowerSupplyRequired());
        System.out.println("***********************************");
        AirConditioner w2=new AirConditioner(10,"green",200.0);
        System.out.println("to string for AirConditioner");
        System.out.println(w2);
        System.out.println("Invoking abstract method:typeOfElectronicGoods using AirConditioner object");
        System.out.println(w2.typeOfElectronicGoods());
        System.out.println("Invoking default method:isPowerSupplyRequired using AirConditioner object");
        System.out.println(w2.isPowerSupplyRequired());
    }
    
}
