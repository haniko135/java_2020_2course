package ru.ikbo1319.experement.ex_2;

import java.util.Scanner;

public class TestDog {

    public void arrayDogs(int number){
        Scanner scanner = new Scanner(System.in);
        Dog[] puppies = new Dog [number];
        for(int i = 0; i < number; i++){
            int num = scanner.nextInt();
            String nam = scanner.nextLine();
            puppies[i] = new Dog(num, nam);
        }
        for(int i = 0; i < number; i++){
            System.out.println(puppies[i]);
        }
    }

    public static void main (String[] args){
        TestDog test = new TestDog();
        int number = 3;
        test.arrayDogs(number);
    }
}
