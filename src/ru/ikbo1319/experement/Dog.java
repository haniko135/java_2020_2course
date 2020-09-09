package ru.ikbo1319.experement;

import java.lang.*;

public class Dog {
    private int age;
    private String name;

    public Dog(int a, String n){
        age = a;
        name = n;
    }

    public Dog(String n){
        name = n;
        age = 0;
    }

    public int getAge(int age) {
        return age;
    }

    public String getName(String name) {
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
        return "Dog{" + "age=" + this.age + ", name='" + this.name + '\'' + '}';
    }

    public void humanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }

}
