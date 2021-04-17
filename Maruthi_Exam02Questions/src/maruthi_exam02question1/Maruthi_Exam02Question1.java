/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maruthi_exam02question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Priyaka Maruthi
 */
public class Maruthi_Exam02Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Scanner scan = new Scanner(System.in);

ArrayList<Integer> test = new ArrayList<Integer>();
        System.out.println("The answer for Question1 as follows by:Priyanka Maruthi");
System.out.print("Enter 10 integers: ");

		for (int i = 0; i < 10; i++) {
			test.add(scan.nextInt());
		}

		removeDuplicate(test);

		System.out.print("The distinct integers are ");
                //Printing all the distinct elements from the array list after duplicate entries are removed
		for (int i = 0; i < test.size(); i++) {
			System.out.print(test.get(i) + " ");
		}
		System.out.println();
	}


	public static void removeDuplicate(ArrayList<Integer> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j))
					list.remove(j);
			}
		}
	}
}

    

