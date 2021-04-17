//Driver.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maruthi_Question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author S541905
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Create an array list of objects
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(new Loan(12.5,2,360000));		
		list.add(new Date());		
		list.add(new String("Hi this is Priyanka Maruthi"));	
		list.add(new Circle(5));	
        System.out.println("The answer for question3 as follows by Priyanka Maruthi");
		// Display all the elements in the list by 
		// invoking the object’s toString() method
		for (int i = 0; i < list.size(); i++) {
			System.out.println((list.get(i)).toString());
		}
	}
}