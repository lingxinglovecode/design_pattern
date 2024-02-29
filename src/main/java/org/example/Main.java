package org.example;

import org.example.factory.FurnitureFactory;
import org.example.factory.ModernFurnitureFactory;
import org.example.product.Chair;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        FurnitureFactory modernFurnitureFactory= new ModernFurnitureFactory();
        Chair chair = modernFurnitureFactory.createChair();
        chair.display();
    }
}