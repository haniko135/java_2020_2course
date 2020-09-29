package ru.ikbo1319.experement.ex_7.pr_3;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {
    private ArrayList<Furniture>furniture;
    private String[] categories;
    Scanner scanner = new Scanner(System.in);

    public FurnitureShop(){
        furniture = new ArrayList<Furniture>();
        //categoriesList();
    }

    /*public void categoriesList(){
        categories = new String[3];
        categories[1] = "Shelfs";
        categories[2] = "Tables";
        categories[3] = "Chairs";
    }*/

    public void setFurniture(int n){
        for(int i = 0; i < n; i += 3){
            furniture.add(i, new Table(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(), scanner.nextDouble(),scanner.nextLine(), scanner.nextDouble()));
            furniture.add(i+1, new Shelf(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(), scanner.nextDouble(),scanner.nextLine()));
            furniture.add(i+2, new Chair(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(), scanner.nextDouble(),scanner.nextLine(), scanner.nextDouble()));
        }
    }
}
