/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Creational;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter category:");
            String c = sc.nextLine().toLowerCase();
            System.out.print("Enter product:");
            String p = sc.nextLine().toLowerCase();

            Item i = new Item();
            String item = i.item(c, p);
            System.out.println("Selected product:"+item);
        }
    }
    
}
