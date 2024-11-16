/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shreyansh.shopping;
import Creational.*;
import Behavioural.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author MSI
 */
public class getitems {
    ArrayList<String> s = new ArrayList<>();
    public ArrayList<Observer> o = new ArrayList<>();
    int ecost = 0;
    int scost = 0;
    int gcost = 0;
    int ccost = 0;
    Scanner sc = new Scanner(System.in);
    boolean b = true;

    public getitems() {
        Cobserver c = new Cobserver(this);
        Eobserver e = new Eobserver(this);
        Gobserver g = new Gobserver(this);
        Sobserver so = new Sobserver(this);
    }
    
    
    public ArrayList<String> order(){
        while(b)
        {
            System.out.print("Enter category:");
            String c = sc.nextLine().toLowerCase();
            System.out.print("Enter product:");
            String p = sc.nextLine().toLowerCase();

            Item i = new Item();
            String item = i.item(c, p);
            System.out.println(p + " added to cart.");
            s.add(p);
            
            costAdd(c,item);
            
            System.out.print("To go to cart enter 0, else press any key:");
            String exit = sc.nextLine();
            if(exit.equals("0")){
                b = false;
            }
        }
        update();
        return s;
    }
    
    private void costAdd(String c, String item)
    {
        switch (c) {
            case "clothing" -> {
                ccost += Integer.parseInt(item);
            }
            case "electronics" -> {
                ecost += Integer.parseInt(item);
            }
            case "grocery" -> {
                gcost += Integer.parseInt(item);
            }
            case "skinCare" -> {
                scost += Integer.parseInt(item);
            }
            default -> throw new AssertionError();
        }
    }
    
    private void update()
    {
        ccost = o.get(0).update(ccost);
        ecost = o.get(1).update(ecost);
        gcost = o.get(2).update(gcost);
        scost = o.get(3).update(scost);
    }
}
