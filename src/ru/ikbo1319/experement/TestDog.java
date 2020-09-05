package ru.ikbo1319.experement;

public class TestDog {
    public static void main (String[] args){
        Dog male = new Dog(7, "Zakhar");
        Dog female = new Dog(4, "Masha");
        Dog child = new Dog(1, "Puppy") ;
        male.setAge(8);
        System.out.println(child);
        female.humanAge();
        child.setName("Maloy");
    }
}
