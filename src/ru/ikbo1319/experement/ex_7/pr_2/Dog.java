package ru.ikbo1319.experement.ex_7.pr_2;

public abstract class Dog {
    private String dog;
    private double age;
    private String name;
    private String size;
    private double height;
    private String sherst;

    public Dog(String dog, double age, String name, String size, double height, String sherst) {
        this.dog = dog;
        this.age = age;
        this.name = name;
        this.size = size;
        this.height = height;
        this.sherst = sherst;
    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSherst() {
        return sherst;
    }

    public void setSherst(String sherst) {
        this.sherst = sherst;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dog='" + dog + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", height=" + height +
                ", sherst='" + sherst + '\'' +
                '}';
    }

    public abstract String voice();
}
