/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational;

/**
 *
 * @author MSI
 */
public class Item {
    private AbstractFactory f;
    private Product prod;
    public String item(String c,String p)
    {
        String item="";
        switch (c) {
            case "clothing" -> {
                f = new ClothingFactory();
                prod = f.createProduct();
                item = prod.getProduct(p);
            }
            case "electronics" -> {
                f = new ElectronicsFactory();
                prod = f.createProduct();
                item = prod.getProduct(p);
            }
            case "grocery" -> {
                f = new GroceryFactory();
                prod = f.createProduct();
                item = prod.getProduct(p);
            }
            case "skinCare" -> {
                f = new SkinCareFactory();
                prod = f.createProduct();
                item = prod.getProduct(p);
            }
            default -> throw new AssertionError();
        }
        return item;
    }
}
