package ru.ikbo1319.experement.ex_24.pr_2;

public class MultifunctionalChair extends AbstractFabric2 implements Chair{
    private int numberOfFunctions;

    public MultifunctionalChair(String color, int age, int numberOfFunctions) {
        super(color, age);
        this.numberOfFunctions = numberOfFunctions;
    }

    public MultifunctionalChair(String color, int age) {
        super(color, age);
    }

    @Override
    public String printChair() {
        return "multifunctional chair";
    }

    @Override
    public void action() {
        System.out.println("I can do anything you want:");
        System.out.println("Cooking");
        System.out.println("Building");
        System.out.println("Doing your homework");
        System.out.println("Helping your granny");
    }
}
