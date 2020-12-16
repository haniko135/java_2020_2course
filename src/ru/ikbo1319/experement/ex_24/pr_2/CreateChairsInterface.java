package ru.ikbo1319.experement.ex_24.pr_2;

public interface CreateChairsInterface {
    public VictorianChair createVicChair(String color, int age, boolean pattern);
    public MagicianChair createMagicChair(String color, int age, int magicLvl);
    public MultifunctionalChair createMultifuncChair(String color, int age, int numberOfFunctions);
}
