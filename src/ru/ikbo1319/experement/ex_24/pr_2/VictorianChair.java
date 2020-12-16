package ru.ikbo1319.experement.ex_24.pr_2;

public class VictorianChair extends AbstractFabric2 implements Chair{
    private boolean pattern = true;
    public VictorianChair(String color, int age) {
        super(color, age);
    }

    public VictorianChair(String color, int age, boolean pattern) {
        super(color, age);
        this.pattern = pattern;
    }
    @Override
    public void action(){
        System.out.println("stand in corner *silence*");
    }

    @Override
    public String printChair() {
        return "victorian chair";
    }
}
