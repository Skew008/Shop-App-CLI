/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational;

/**
 *
 * @author MSI
 */
public class Electronics implements Product{

    @Override
    public String getProduct(String product) {
        String s = switch (product) {
            case "tv" -> "18000";
            case "fridge" -> "15000";
            case "mixer" -> "6000";
            case "speaker" -> "4000";
            case "dishwasher" -> "12000";
            default -> throw new AssertionError();
        };
        return s;
    }
}
