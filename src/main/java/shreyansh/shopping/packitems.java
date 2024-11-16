/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shreyansh.shopping;
import Structural.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author MSI
 */
public class packitems {
    ArrayList<String> packed = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public ArrayList<String> placed(ArrayList<String> p)
    {
        for(int i=0; i<p.size(); i++)
        {
            System.out.print("Want to gift wrap "+p.get(i)+":");
            if(sc.nextLine().equalsIgnoreCase("yes")){
                Packing pk = new GiftWrap(new NoPack());
                System.out.println(p.get(i)+" is being gift wrapped.");
                packed.add(pk.pack(p.get(i)));
            }
            else{
                Packing pk = new NormalPacking(new NoPack());
                System.out.println(p.get(i)+" is being packed normally.");
                packed.add(pk.pack(p.get(i)));
            }
        }
        sc.close();
        return packed;
    }
}
