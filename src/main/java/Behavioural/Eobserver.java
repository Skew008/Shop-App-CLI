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
public class Eobserver implements Observer{

    public Eobserver(getitems g) {
        g.o.add(this);
    }
    
    @Override
    public int update(int i) {
        if(i>20000 && i<30000)
        {
            System.out.println("You got 15% discount on Electronics items");
            i -= (0.15*i);
        }
        else if(i>30000)
        {
            System.out.println("You got 25% discount on Electronics items");
            i -= (0.25*i);
        }
        return i;
    }
}
