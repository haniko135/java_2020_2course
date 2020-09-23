package ru.ikbo1319.experement.ex_7.pr_3;

public class Person {
    private String[] basket;
    private double index = 0;

    public Person(String[] basket) {
        this.basket = basket;
    }

    public void addBasket(int n, String furn){
        for(int i = 0; i < n; i++){
            basket[i] = new String(furn);
        }
        index += n;
    }
}
