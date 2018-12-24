package com.company;

public class Rectangle extends Shape{
    private double height;
    private double width;
    private String color;

    public Rectangle(double h, double w){
        super("Blue");
        height=h;
        width=w;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getSquare() {
        return height*width;
    }


}
