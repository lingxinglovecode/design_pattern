package org.example.javaPrototype;

public class Circle implements Cloneable {
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius+"]"+super.toString();
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(10);
        System.out.println(circle);
        try {
            Circle clone = circle.clone();
            System.out.println(clone);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
