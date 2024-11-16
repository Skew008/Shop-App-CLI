/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structural;

/**
 *
 * @author MSI
 */
public abstract class Decorator extends Packing{
    Packing p;
    
    public Decorator(Packing p){
        this.p=p;
    }
    
    @Override
    public String pack(String message)
    {
        return p.pack(message);
    }
}
