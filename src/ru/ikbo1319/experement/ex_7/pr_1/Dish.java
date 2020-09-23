package ru.ikbo1319.experement.ex_7.pr_1;

public abstract class Dish {
    private String container;
    private double volume;
    private String manufacturer;
    private String color;
    private String material;

    public Dish(String container, double volume, String manufacturer, String color, String material) {
        this.container = container;
        this.volume = volume;
        this.manufacturer = manufacturer;
        this.color = color;
        this.material = material;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "container='" + container + '\'' +
                ", volume=" + volume +
                ", manufacturer='" + manufacturer + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
