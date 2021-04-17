/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maruthi_ExamQuestion2;

import java.util.Scanner;

/**
 *
 * @author S541905
 */
public class Maruthi_Exam02Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  int[][] array1 = new int[3][3];
        int[][] array2 = new int[3][3];

        Scanner scan = new Scanner(System.in);
        System.out.println("The answer for Question2 as follows by Priyanka Maruthi ");
        System.out.print("Enter list1: ");
        for (int i = 0; i < array1.length; i++)
            for (int j = 0; j < array1[i].length; j++)
                array1[i][j] = scan.nextInt();
        System.out.print("Enter list2: ");
        for (int i = 0; i < array2.length; i++)
            for (int j = 0; j < array2[i].length; j++)
                array2[i][j] = scan.nextInt();

        if (equals(array1, array2)) {
            System.out.println("The two arrays are strictly identical.");
        } else {
            System.out.println("The two arrays are not strictly identical");
        }
    }

   public static boolean equals(int[][] m1, int[][] m2) {
          
        if (m1.length != m2.length||m1[0].length!=m2[0].length) 
            return false;

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {

                if (m1[i][j] != m2[i][j]) 
                    return false;
              
            }
        }

        return true;
    }
}