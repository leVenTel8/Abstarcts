package com.company;

public class Circle extends Shape{
    private double radius;
    private String color;

    public Circle(double r){
        super("Red");
        radius=r;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getSquare() {
        return 3.14*radius*radius;
    }

}
