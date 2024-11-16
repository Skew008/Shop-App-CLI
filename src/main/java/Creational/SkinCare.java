/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational;

/**
 *
 * @author MSI
 */
public class SkinCare implements Product{
    
    @Override
    public String getProduct(String product) {
        String s = switch (product) {
            case "facewash" -> "120";
            case "bodywash" -> "150";
            case "sunscreen" -> "65";
            case "moisturizer" -> "105";
            case "facescrub" -> "80";
            default -> throw new AssertionError();
        };
        return s;
    }
}
