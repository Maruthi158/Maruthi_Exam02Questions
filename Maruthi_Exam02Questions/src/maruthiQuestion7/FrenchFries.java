/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maruthiQuestion7;

/**
 *
 * @author Priyanka Maruthi
 */
public enum FrenchFries {
 SMALL(8),MEDIUM(9.0),LARGE(10);
    
    private double price;
   

    private FrenchFries(double price) {
        this.price = price;
       
    }

    public double getPrice() {
        return price;
    }
    
    
    
}