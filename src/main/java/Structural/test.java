/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Structural;

/**
 *
 * @author MSI
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Packing p = new NoPack();
        p.pack("Ball");
//        p = new GiftWrap(p);
//        p.pack("Ball");
        p = new NormalPacking(p);
        p.pack("Ball");
    }
    
}
