package com.company;

public class Circle extends Shape{
    float radius;

    Circle() {
        super();
        this.radius = 1f;
    }

    Circle(String color, boolean isFilled, float radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius + " which is a subclass of " + super.toString();
    }
}
