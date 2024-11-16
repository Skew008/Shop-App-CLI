/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational;

/**
 *
 * @author MSI
 */
public class Grocery implements Product{
    
    @Override
    public String getProduct(String product) {
        String s = switch (product) {
            case "milk" -> "40";
            case "pasta" -> "50";
            case "bread" -> "25";
            case "honey" -> "75";
            case "yogurt" -> "30";
            case "cookies" -> "45";
            case "donuts" -> "65";
            default -> throw new AssertionError();
        };
        return s;
    }
}
