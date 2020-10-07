package ru.ikbo1319.experement.ex_10;

import java.util.Scanner;

public class Numbers {
    private int sum = 0;
    private int krazr = 0;
    private int scount = 0;
    private int a;
    private int b;
    private int index = (int) Math.pow(10.0, krazr-1);
    private Scanner scanner = new Scanner(System.in);

    public void Numbers_1(){
        krazr = scanner.nextInt();
        sum = scanner.nextInt();
        while (index < Math.pow(10, krazr)){
            int ssum = 0;
            int num = index;

            while (num != 0){
                ssum += num%10;
                num /= 10;
            }
            if(ssum == sum){
                System.out.println(index + " ");
                scount++;
            }
            index++;
        }
        System.out.println(scount);
    }

    public int Numbers_2(int a, int b){
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a > b+1){
            return 0;
        }
        if (a==0 || b==0) {
            return 1;
        }
        return (Numbers_2(a,b-1) + Numbers_2(a-1,b-1));
    }

    public void Numbers_3(){
        a = scanner.nextInt();
        Numbers_3_1(a);
    }

    public int Numbers_3_1(int a){
        int s = 0;
        if(a != 0){
            s = a % 10;
            System.out.print(s);
        }
        return Numbers_3_1(a /= 10);
    }

    Numbers(){
        Numbers_1();
        Numbers_2(a, b);
        Numbers_3();
    }

    public static void main(){
        new Numbers();
    }
}
