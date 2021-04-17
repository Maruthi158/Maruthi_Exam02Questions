//Electronics.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maruthi_Question9;

/**
 *
 * @author Priyanka Maruthi
 */
public interface Electronics {
      public static final String powerSupply="YES";
     public abstract String typeOfElectronicGoods();
     default String isPowerSupplyRequired(){
         return "The power supply is required";
     }
}
