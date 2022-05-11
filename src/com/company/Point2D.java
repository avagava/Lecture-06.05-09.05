package com.company;

import java.awt.*;

public class Point2D {
    //Implement the `Point2D` class. It should contain:
    //* two float fields : `x`, `y`
    //*  non-arguments constructor which will set `x`, `y` fields to `0`
    //* two-arguments constructor: `float x`, `float y`
    //* `getter` methods which will be responsible for returning `x`, `y` fields values
    //* `getXY` method which will return `x`, `y` values as two-element array
    //* `setter` methods which will be responsible for setting `x`, `y` fields values
    //* `setXY` method which will be responsible for settting `x` and `y`
    //* `toString` method which should return string in the following format: `(x, y)`
    //
    //
    //Using the `Point2D` class implement the `Point3D` class. It should extend the `Point2D` class. It should contain:
    //
    //* private float field: `z`
    //* three-arguments constructor: `float x`, `float y`, `float z`
    //* `getter` method which will be responsible for returning the `z` field value
    //* `getXYZ` method which will return `x`, `y`, `z` values as three-element array
    //* `setter` method which will be responsible for setting the `z` field value
    //* `setXYZ` method which will be responsible for setting `x`, `y`, `z`
    //* `toString` method which should return string in the following format: `(x, y, z)`

    //Two float fields: "x", "y"
    private float x, y;

    //Non-arguments constructor which will set "x" and "y" fields to 0
    Point2D() {
        this.x = 0;
        this.y = 0;
    }

    //two-arguements constructor: float x and float y
    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    //getter method which wil be responsible for returning x and y field values
    float getX() {
        return x;
    }

    float getY() {
        return y;
    }

    //getXY method which will return x and y values as two-element array
    public float[] getXY() {
        return new float[]{x,y};
    }

    //setter method which will be responsible for setting x and y field values
    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
