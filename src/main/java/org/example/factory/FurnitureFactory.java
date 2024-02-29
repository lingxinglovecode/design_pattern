package org.example.factory;

import org.example.product.Chair;
import org.example.product.Desk;

public interface  FurnitureFactory {
    Desk createDesk();
    Chair createChair();
}
