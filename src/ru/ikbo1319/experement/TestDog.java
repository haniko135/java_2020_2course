package ru.ikbo1319.experement;

import java.util.Scanner;

public class TestDog {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Dog[] puppies = new Dog [3];
        for(int i = 0; i < 3; i++){
            int num = scanner.nextInt();
            String nam = scanner.nextLine();
            puppies[i] = new Dog(num, nam);
        }
        for(int i = 0; i < 3; i++){
            System.out.println(puppies[i]);
        }
    }
}
