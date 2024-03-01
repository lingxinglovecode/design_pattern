package org.example.prototype;

public class Rectangle extends Shape {
    int height, width;

    public Rectangle() {
    }

    Rectangle(Rectangle rectangle){
        super();
        this.height = rectangle.height;
        this.width = rectangle.width;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }
}
