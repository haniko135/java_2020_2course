package ru.ikbo1319.experement;

public class Dog {
    private int age;
    private String name;

    public Dog(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void humanAge(){
        System.out.print(name+ "в человеческом мире был(а) бы " + age*7 + "возраста");
    }
}
