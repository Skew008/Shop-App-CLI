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
public class Gobserver implements Observer{

    public Gobserver(getitems g) {
        g.o.add(this);
    }
    
    @Override
    public int update(int i) {
        if(i>250 && i<500)
        {
            System.out.println("You got 15% discount on Grocery items");
            i -= (0.15*i);
        }
        else if(i>500)
        {
            System.out.println("You got 20% discount on Grocery items");
            i -= (0.2*i);
        }
        return i;
    }
}
