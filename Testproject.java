/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testproject;

/**
 *
 * @author hochinh
 */

import java.util.Scanner;
public class Testproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String restaurant = new String();
        
        System.out.println("Hello World!");
        System.out.print("Please enter you favorite restaurant: ");
        restaurant = sc.nextLine();
        System.out.println("Tomorrow, you should go to " + restaurant + "for lunch!");
        
        
        // TODO code application logic here
    }
    
}
