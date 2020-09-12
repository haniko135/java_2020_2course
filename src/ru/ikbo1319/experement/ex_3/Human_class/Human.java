package ru.ikbo1319.experement.ex_3.Human_class;

public class Human {

    public Human(){
        Head head = new Head();
        Body body = new Body();
        Hand hand = new Hand();
        Leg leg = new Leg();
    }
    public void getHead(){
        Head head = new Head();
        String brains = head.getBrains();
        String eyes = head.getEye();
        String ears = head.getEars();
        String mouth = head.getMouth();
        String nose = head.getNose();
        String neck = head.getNeck();
    }

    public static void main(String[] args){
        Human human = new Human();
        human.getHead();
    }
}
