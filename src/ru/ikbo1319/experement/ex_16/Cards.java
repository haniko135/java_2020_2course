package ru.ikbo1319.experement.ex_16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Cards {

    public static void Game(Queue<Integer> first, Queue<Integer> second){
        int turn=0;
        while (!first.isEmpty() && !second.isEmpty() && (turn < 106)){
            int one = first.remove();
            int two = second.remove();

            if((one > two)||(one == 0 && two == 9)){
                first.add(one);
                first.add(two);
            }
            else if((two > one)||(one == 9 && two == 0)){
                second.add(one);
                second.add(two);
            }
            turn++;
        }
        if(turn == 106){
            System.out.println("botva");
        }
        else if (second.isEmpty() == true){
            System.out.println("first " + turn);
        }
        else if(first.isEmpty() == true){
            System.out.println("second " + turn);
        }
    }

    public static void main(String[] args){
        Random random = new Random();
        Queue<Integer> first = new LinkedList<Integer>();
        Queue<Integer> second = new LinkedList<Integer>();
        for (int i = 0; i < 5; i++){
            int num = random.nextInt(9);
            first.offer(num);
            System.out.print(num + " ");
        }
        System.out.println(" ");
        for (int i = 0; i <= 8; i += 2){
            int num = random.nextInt(9);
            second.offer(num);
            System.out.print(num + " ");
        }
        System.out.println(" ");
        Game(first, second);
    }
}
