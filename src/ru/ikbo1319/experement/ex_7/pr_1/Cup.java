package ru.ikbo1319.experement.ex_7.pr_1;

import ru.ikbo1319.experement.ex_7.Dish;

public class Cup extends Dish {
    private double height;

    public Cup(String container, double volume, String manufacturer, String color, String material, double height) {
        super(container, volume, manufacturer, color, material);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "height=" + height + super.toString() +
                '}';
    }
}
