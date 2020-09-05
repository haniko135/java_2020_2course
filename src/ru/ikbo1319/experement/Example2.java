package ru.ikbo1319.experement;

import java.util.Random;

public class Example2 {
    public static void main(String[]args){

        /*int[] n = {67, 16, 74, 24, 6, 178, 66, 3, 0};      || первое задание
        int sum = 0;*/

        /*for(int i = 0; i < n.length-1; i++) {
            sum = sum + n[i];
        }*/

        /*int j=0;
        while(j < n.length){
            sum = sum + n[j];
            j++;
        }*/

        /*int j=0;
        do{
            sum = sum + n[j];
            j++;
        }
        while(j < n.length);

        System.out.println(sum);*/



        /*for(int i = 0; i < 5; i++) {                  // второе задание
            System.out.print(args[i]);
        }*/



        /*for(int i = 1; i < 15; i++){                    // третье задание
            System.out.printf(" %.2f", 1.0 / i);
        }*/



        /*int [] array = new int [5];                   // четвёртое задание
        for(int i = 0; i < 5; i++){
            double n = Math.random() * 100;
            array[i] = (int) n;
        }*/

        /*for(int i = 0; i < 5; i++){
            array[i] = new Random().nextInt(18);
        }*/
        /*for(int i = 0; i < 5; i++){
            System.out.print(" ");
            System.out.print(array[i]);
        }
        System.out.println();
        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( array[j] > array[j+1] ){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        for(int i = 0; i < 5; i++){
            System.out.print(" ");
            System.out.print(array[i]);
        }*/


        // System.out.println(myFactorial(5));      // пятое задание
















    }

    static int myFactorial(int a){              // функция
        int result = 1;
        for(int i = 1; i <= a; i++){
            result = result*i;
        }
        return result;
    }
}
