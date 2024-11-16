/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational;

/**
 *
 * @author MSI
 */
public class Clothing implements Product{

    @Override
    public String getProduct(String product) {
        String s = switch (product) {
            case "tshirt" -> "700";
            case "shirt" -> "500";
            case "jeans" -> "1500";
            case "hoodie" -> "1200";
            case "denim" -> "1800";
            default -> throw new AssertionError();
        };
        return s;
    }
}
