package com.company;

public class Shape {
    //Implement the `Shape` class. It should contain:
    //
    //* color information
    //* information if color should fill a shape
    //* non-arguments constructor which will set: the `color` field to `unknown` and the `isFilled` field to `false`
    //* two-arguments constructor: `color`, `isFilled`
    //* `getter` methods which will be responsible for returning declared fields
    //* `setter` methods which will be responsible for setting declared fields
    //*  `toString` method which should return the following information: `Shape with color of ? and filled/NotFilled`, where ? is a placeholder for the color and the `filled`/`not filled` info should be returned depending on the `isFilled` field
    //
    //Implement the `Circle` class. It should extend the `Shape` class. Implementation should meet the below criteria:
    //
    //* information about the radius value
    //* non-arguments constructor which will set: the `color` field value to `unknown`, the `isFilled` field value to `false` and the `radius` field value to `1`
    //* three-arguments constructor: `color`, `isFilled`, `radius`
    //* `getter` methods which will be responsible for returning the `radius` value
    //* `setter` methods which will be responsible for setting the `radius` value
    //* `getArea` method which will be responsible for calculating the surface area
    //* `getPerimeter` method which will be responsible for calculating the circuit
    //* `toString` method which should return the following information: `Circle with radius=? which is a subclass off y`, where ? is a placeholder for the radius value and the `y` info should be a result of the `toString` execution from the base class
    //
    //
    //
    //Implmenent the `Rectangle` class. It should extend the `Shape` class. Implementation should meet the below criteria:
    //
    //* information about the width and length value as a `double` type
    //* non-arguments constructor which will set: the `color` field value to `unknown`, the `isFilled` field value to `false` and the `width` and `length` field value to `1`
    //* four-arguments constructor: `color`, `isFilled`, `width` i `length`
    //* `getter` methods which will be responsible for returning the `width` and `length` value
    //* `setter` methods which will be responsible for setting the `width` and `length` value
    //* `getArea` method which will be responsible for calculating the surface area
    //* `getPerimeter` method which will be responsible for calculating the circuit
    //* `toString` method which should return the following information: `Rectangle with width=? and length=? which is a subclass off y`, where ? is a placeholder for the width and length value accordingly and the `y` info should be a result of the `toString` execution from the base class
    //
    //
    //Implement the `Square` class which will extend the `Rectangle` class. It should not add any new field or feature, but it should force square behaviour on the base class methods.
    //
    //Please provide an example usage of above implementation.


    //Task4
    //Modify implementation prepared as a scope of task 8. Refactor the following functionality:
    //
    //* make the `Shape` class abstract
    //* change the `Shape` class fields access modifiers to `protected`
    //* add two abstract methods: `getArea` and `getPerimeter`
    //
    //Each class which is extending the `Shape` class directly/indirectly  should override abstract methods from base class.
    //
    //Please provide an example usage of above implementation.

    String color;
    boolean isFilled;

    Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public boolean getIsFilled() {
        return isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean isFilled) {
        this.isFilled = isFilled;
    }

    String getFilled() {
        if(isFilled) {
            return "filled";
        } else {
            return "not filled";
        }
    }

    @Override
    public String toString() {
        return "Shape with color " + color + " and " + getFilled();
    }
}
