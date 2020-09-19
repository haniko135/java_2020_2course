package ru.ikbo1319.experement.ex_5.pr_2;

public class Square_pr_2 extends Shape_pr_2 {
    private double side;

    public Square_pr_2(String border_color, boolean filled_color, double side) {
        super(border_color, filled_color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }

    @Override
    public double perimetr() {
        return 4* side;
    }
}
