package ru.ikbo1319.experement.ex_7.pr_3;

import java.util.Arrays;

public class FurnitureShop {
    private double price;
    private Furniture[] furniture;
    private String[] categories;

    public FurnitureShop(int n){
        furniture = new Furniture[n];
    }
    public void categoriesList(){
        categories = new String[3];
    }

    public static void main(){

    }
}
