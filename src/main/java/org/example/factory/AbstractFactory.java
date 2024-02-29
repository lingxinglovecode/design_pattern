package org.example.factory;

import org.example.product.Product;

abstract class AbstractFactory {
    Product product;
    abstract Product createProduct();

    public void displayProduct() {
        createProduct().display();
    }
}
