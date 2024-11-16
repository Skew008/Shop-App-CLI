/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational;

/**
 *
 * @author MSI
 */
public class ClothingFactory implements AbstractFactory{

    @Override
    public Product createProduct() {
        return new Clothing();
    }
}
