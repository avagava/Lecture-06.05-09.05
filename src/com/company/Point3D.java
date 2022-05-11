package com.company;

public class Point3D extends Point2D {
    private  float z;

    //Three-arguement constructor: float x, float y, float z
    Point3D(float x, float y, float z) {
        this.z = z;
        this.setXY(x,y);
    }

    //Getter method which will be responsible for returning the z field value
    public float getZ(){
        return z;
    }

    //getXYZ method which will return x, y, z values as three-element array
    public float[] getXYZ(){
        return new float[]{this.getX(), this.getY(), this.z};
    }

    //Setter method which will be responsible for setting the z field value
    public void setZ(float z) {
        this.z = z;
    }

    //setXYZ method which will be responsible for setting x, y, z.
    public void setXYZ(float x, float y, float z) {
        this.z = x;
        this.setXY(x, y);
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}

