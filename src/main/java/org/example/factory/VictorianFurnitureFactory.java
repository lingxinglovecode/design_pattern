package org.example.factory;

import org.example.product.Chair;
import org.example.product.Desk;
import org.example.product.VictorianChair;
import org.example.product.VictorianDesk;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Desk createDesk() {
        return new VictorianDesk();
    }

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
