package com.company;

public class Rectangle extends Shape{
    double width, length;

    Rectangle() {
        super();
        this.width = 1f;
        this.length = 1f;
    }

    Rectangle(double length, double width, String color, boolean isFilled) {
        super (color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle with width = " + width + " and length = " + length + " which is a subclass of " + super.toString();
    }
}
