package ru.ikbo1319.experement.ex_24.pr_2;

public class Client {
    private Chair chair;

    public void sit(){
        System.out.println("Client sits on " + chair.printChair());
    }
    public void choseChair(Chair chair){
        this.chair = chair;
    }
}
