package com.company;

public class Line {
    //Implement the `Line` class which will contain (as a composition) the instance of two `Point2D` object from task 6. Those points should be the start and end point of the line. In addition, this class should implement:
    //
    //* two-arguments constructor: begin point, end point
    //* four-arguments constructor accepting 4 parameters: coordinates of the start and end point
    //* `getter` method which will be responsibe for returning start and end points
    //* `setter` method which will be responsible for setting start and end points
    //* the method responsible for calculating the length of the line based on the set points
    //* the method responsible for returning the coordinates of the point being the center of the created line
    //
    //Please provide an example usage of above implementation.

    Point2D start, end;

    Line(Point2D beginPoint, Point2D endPoint) {
        this.start = beginPoint;
        this.end = endPoint;
    }

    Line(float beginPointX, float beginPointY, float endPointX, float endPointY){
        this.start = new Point2D(beginPointX, beginPointY);
        this.end = new Point2D(beginPointX, beginPointY);
    }

    public Point2D getStart() {
        return start;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setStart(Point2D start) {
        this.start = start;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }

    public double getLength() {
        //Subtract the x and y coordinate of both points
        //Square the result of the subtraction
        //Add the x and y coordinates
        //Distance = square root of addition
        double x = start.getX() - end.getX();
        double y = start.getY() - end.getY();

        //Square the result of the subtraction
        x = x * x;
        y = y * y;


        //Add the x and y coordinates
        double sum = x + y;

        //Distance = square root of addition
        double distance = Math.sqrt(sum);
        return distance;
    }

    public Point2D getCenter() {
        //Add x coordinates and divide by 2
        float x = (start.getX() + end.getX())/2;

        //Add y coordinates and divide by 2
        float y = (start.getY() + end.getY())/2;

        return new Point2D(x,y);
    }

}
