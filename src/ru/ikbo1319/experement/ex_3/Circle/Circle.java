package ru.ikbo1319.experement.ex_3.Circle;

import java.lang.Math;

public class Circle {
    private double radius;
    private double line;
    private double square;
    private double diametr;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiametr() {
        return radius * 2.0;
    }

    public double getLine() {
        return 2.0 * Math.PI * radius;
    }

    public double getSquare() {
        return square = Math.PI * Math.pow(radius,2);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
