package ru.ikbo1319.experement.ex_5._pr_1;

public class Rectangle_pr_2 extends Shape {
    private double width;
    private double length;

    public Rectangle_pr_2(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle_pr_2(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle_pr_2() { }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimetr() {
        return 2*(length + width);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
