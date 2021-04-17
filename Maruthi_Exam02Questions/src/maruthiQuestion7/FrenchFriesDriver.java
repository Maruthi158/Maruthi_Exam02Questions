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
public class FrenchFriesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The answer for Question7 as follows by Priyanka Maruthi");
        System.out.println(FrenchFries.LARGE.getPrice());
        
        for(FrenchFries f:FrenchFries.values())//method values
        {
            System.out.println(f+" Fries is of $"+f.getPrice());
        }
        //value of method implementation
        FrenchFries valueOf=FrenchFries.valueOf("SMALL");
        System.out.println(valueOf);//prints enum
        System.out.println(valueOf.getPrice());
        
   
       
       
    }
    
}
