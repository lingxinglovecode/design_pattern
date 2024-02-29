package org.example.factory;

import org.example.product.Chair;
import org.example.product.Desk;
import org.example.product.ModernChair;
import org.example.product.ModernDesk;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Desk createDesk() {
        return new ModernDesk();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
