package ru.ikbo1319.experement.ex_5.pr_2;

public class Rectangle_pr_2 extends Shape_pr_2 {
    private double length;
    private double width;

    public Rectangle_pr_2(String border_color, boolean filled_color, double length, double width) {
        super(border_color, filled_color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimetr() {
        return 2*(length + width);
    }

    @Override
    public String toString() {
        return "Rectangle_pr_2{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
