/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shreyansh.shopping;

import java.util.ArrayList;
/**
 *
 * @author MSI
 */
public class facade {
    
    ArrayList<String> p = new ArrayList<>();
    ArrayList<String> placed = new ArrayList<>();
    getitems g = new getitems();
    packitems pkitems = new packitems();
    
    public void buyProducts()
    {
        p = g.order();
        System.out.println(p);
        System.out.println("");
        placed = pkitems.placed(p);
        System.out.println("");
//        System.out.println(placed);
        System.out.println("Total cost = "+g.ccost+g.ecost+g.gcost+g.scost);
    }
}
