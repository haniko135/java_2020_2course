package ru.ikbo1319.experement.ex_5.pr_2;

public class Circle_pr_2 extends Shape_pr_2 {
    private double radius;

    public Circle_pr_2(String border_color, boolean filled_color, double radius) {
        super(border_color, filled_color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle_pr_2{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimetr() {
        return 2 * Math.PI * radius;
    }
}
