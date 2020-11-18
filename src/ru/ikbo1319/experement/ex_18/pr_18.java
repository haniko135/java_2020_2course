package ru.ikbo1319.experement.ex_18;

import java.util.Scanner;

public class pr_18 {

    public static void mnoshiteli(int num, int div){
        if(num == 1){ return; }
        if(num%div == 0){
            System.out.print(div + " ");
            mnoshiteli(num / div, div);
        }
        else {
            if (div == 2){
                mnoshiteli(num, div + 1);
            }
            else {
                mnoshiteli(num, div + 2);
            }
        }
    }

    public static String palindrom(String str){
        if(str.length() == 1) {
            return "YES";
        }
        else {
            if(str.substring(0,1).equals(str.substring(str.length()-1, str.length()))){
                if (str.length() == 2){
                    return "YES";
                }
                else{
                    palindrom(str.substring(1, str.length()-1));
                }
            }
            else{
                return "NO";
            }
        }
        return "YES";
    }

    public static int maximum(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        return (num == 0) ? 0 : max(num, maximum());
    }

    public static int max(int one, int two){
        return (one > two) ? one : two;
    }


    public static void main(String[] args){
        mnoshiteli(125, 3);
        String phrase = "lo";
        System.out.println(palindrom(phrase));
        System.out.println(maximum());
    }
}
