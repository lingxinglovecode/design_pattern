package org.example.factory;

import org.example.product.ChairProduct;
import org.example.product.Product;

public class ChairFactory extends AbstractFactory{

    @Override
    Product createProduct() {
        return new ChairProduct();
    }
}
