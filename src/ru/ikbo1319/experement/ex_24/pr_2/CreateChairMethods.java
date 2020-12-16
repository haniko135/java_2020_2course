package ru.ikbo1319.experement.ex_24.pr_2;

public class CreateChairMethods implements CreateChairsInterface{

    @Override
    public VictorianChair createVicChair(String color, int age, boolean pattern) {
        return new VictorianChair(color,age,pattern);
    }

    @Override
    public MagicianChair createMagicChair(String color, int age, int magicLvl) {
        return new MagicianChair(color, age, magicLvl);
    }

    @Override
    public MultifunctionalChair createMultifuncChair(String color, int age, int numberOfFunctions) {
        return new MultifunctionalChair(color, age, numberOfFunctions);
    }
}
