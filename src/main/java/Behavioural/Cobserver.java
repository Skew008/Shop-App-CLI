/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Behavioural;

import shreyansh.shopping.getitems;

/**
 *
 * @author MSI
 */
public class Cobserver implements Observer{
    
    public Cobserver(getitems g) {
        g.o.add(this);
    }
    
    @Override
    public int update(int i) {
        if(i>2500 && i<3000)
        {
            System.out.println("You got 10% discount on Clothing items");
            i -= (0.1*i);
        }
        else if(i>3000)
        {
            System.out.println("You got 20% discount on Clothing items");
            i -= (0.2*i);
        }
        return i;
    }
}
