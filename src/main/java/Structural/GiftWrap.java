/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural;

/**
 *
 * @author MSI
 */
public class GiftWrap extends Decorator{
    
    public GiftWrap(Packing p) {
        super(p);
    }

    @Override
    public String pack(String message) {
       return super.pack(message + " is gift wrapped");
    }
    
}
