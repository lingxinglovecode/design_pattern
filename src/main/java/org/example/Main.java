package org.example;


import org.example.prototype.Rectangle;
import org.example.prototype.Shape;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Shape clone = rectangle.clone();
    }
}