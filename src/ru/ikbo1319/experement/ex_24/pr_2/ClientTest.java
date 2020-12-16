package ru.ikbo1319.experement.ex_24.pr_2;

public class ClientTest {
    public static void main(String[] args){
        Client client = new Client();
        CreateChairMethods chair = new CreateChairMethods();
        String color = "metallic";
        int functions = 7;
        int age = 2;
        int lvl = 10;
        client.choseChair(chair.createMultifuncChair(color,age,functions));
        client.sit();
        chair.createMagicChair(color, age, lvl).action();
    }
}
