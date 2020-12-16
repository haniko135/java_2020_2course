package ru.ikbo1319.experement.ex_24.pr_2;

public abstract class AbstractFabric2 {
    private String color;
    private int age;

    public AbstractFabric2(String color, int age) {
        this.color = color;
        this.age = age;
    }

    public AbstractFabric2(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
