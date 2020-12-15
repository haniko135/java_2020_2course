package ru.ikbo1319.experement.ex_22.pr_1;

import java.util.Scanner;

public class Shopping {
    public static void main (String[] args){
        new Shopping();
    }
    Shopping(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введiть ваше прiзвище, iм'я та по-батьковi");
        String nameClient = scanner.nextLine();
        System.out.println("Введiть ваше РНУКПП (українське ІНН)");
        String innClient = scanner.nextLine();
        try {
            ClientInfo client = new ClientInfo(nameClient, innClient);
            System.out.println("Ваша інформація вірна");
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
