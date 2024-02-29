package org.example.factory;

import org.example.product.DeskProduct;
import org.example.product.Product;

public class DeskFactory extends AbstractFactory {
    @Override
    Product createProduct() {
        return new DeskProduct();
    }
}
