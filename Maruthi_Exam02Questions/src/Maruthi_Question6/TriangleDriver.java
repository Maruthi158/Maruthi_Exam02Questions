//TriangleDriver.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maruthi_Question6;

import java.util.Scanner;

/**
 *
 * @author Priyanka Maruthi
 */
public class TriangleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
         System.out.println("The answer for Question6 as Follows by Priyanka Maruthi"); 
     System.out.println("Enter length of Triangle");
         double length=scan.nextInt();
      System.out.println("Enter breadth of Triangle");
       double breadth=scan.nextInt();
      System.out.println("Enter height of Triangle");
       double height=scan.nextInt();
       System.out.println("Enter the color to be filled");
       String color=scan.next();
       System.out.println("Enter the boolean value to check filled or not");
       boolean filled=scan.nextBoolean();
       Triangle T1=new Triangle(length,breadth,height,color,filled);
        System.out.print("Area of Triangle : ");
        System.out.println(T1.getArea());
         System.out.print("Perimeter of Triangle : ");
        System.out.println(T1.getPerimeter());
        System.out.print("colour of Triangle : ");
        System.out.println(T1.getColor());
        System.out.print("Triangle is filled or not : ");
        System.out.println(T1.isFilled());
       
       
       
       
       
         
     
    }
    
}
