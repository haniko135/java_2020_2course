package ru.ikbo1319.experement.ex_7.pr_1;

public class Plate extends Dish {
    private double size;
    private double depth;

    public Plate(String container, double volume, String manufacturer, String color, String material, double size, double depth) {
        super(container, volume, manufacturer, color, material);
        this.size = size;
        this.depth = depth;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "size=" + size +
                ", depth=" + depth + super.toString() +
                '}';
    }
}
