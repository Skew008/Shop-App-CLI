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
public class Sobserver implements Observer{

    public Sobserver(getitems g) {
        g.o.add(this);
    }
    
    @Override
    public int update(int i) {
        if(i>500 && i<1000)
        {
            System.out.println("You got 10% discount on Skin care items");
            i -= (0.1*i);
        }
        else if(i>1000)
        {
            System.out.println("You got 15% discount on Skin care items");
            i -= (0.15*i);
        }
        return i;
    }
}
