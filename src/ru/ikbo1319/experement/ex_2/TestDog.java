package ru.ikbo1319.experement.ex_2;

import java.util.Scanner;
import java.util.Arrays;

public class TestDog {
    private Dog[] arrayDog;
    int index = 0;
    Scanner scanner = new Scanner(System.in);
    public TestDog(int args){
        arrayDog = new Dog[args];
    }

    public void changeArrLen(int n){
        arrayDog = Arrays.copyOf(arrayDog, n);
    }

    public void addArray(int n){
        for (int i = 0; i < n; i++)
            arrayDog[i] = new Dog(scanner.nextInt(), scanner.nextLine());
        index += n;
    }

    @Override
    public String toString() {
        return "TestDog{" +
                "arrayDog=" + Arrays.toString(arrayDog) +
                ", index=" + index +
                '}';
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        TestDog test = new TestDog(scanner.nextInt());
        int num = scanner.nextInt();
        test.addArray(num);

        System.out.println(test);
    }
}
