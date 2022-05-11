package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Student student = new Student("BSc", 2002, 1100);
        student.setName("David");
        student.setAddress("Test");

        System.out.println(student);

        Lecturer lecturer = new Lecturer("Data Analyst", 3500);
        lecturer.setName("David");
        lecturer.setAddress("Test");

        System.out.println(lecturer);

        Shape blueShape = new Shape("Blue",true);
        Shape redShape = new Shape("Red",false);
        Shape shape = new Shape();

        System.out.println(blueShape);
        System.out.println(redShape);

        System.out.println(shape);

        Circle circle = new Circle();
        Circle bigCircle = new Circle("red", true, 4f);

        System.out.println(circle);
        System.out.println(bigCircle);

        Rectangle rectangle = new Rectangle(23, 15, "yellow", false);
        Square square = new Square();

        System.out.println(rectangle);
        System.out.println(square);


        //Line line = new Line(0f, 0f, 5f, 5f)
        //System.out.println(line.getLength());
        //System.out.println(line.getCenter());

    }


}
