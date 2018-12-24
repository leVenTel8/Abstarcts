package com.company;

public abstract class Shape {
    private String color;

    public Shape(String c){
        color=c;
    }

    public abstract String getName();
    public abstract double getSquare();
    public String getColor(){
        return color;
    }
}
