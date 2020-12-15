package ru.ikbo1319.experement.ex_21;

import java.util.Scanner;

public class Exception {
    public static void main (String[] args){
        new Exception();
    }
    Exception(){
        double a = 6.0;
        double b = 0.0;
        System.out.println(a/b);
        exceptionDemo();
    }
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        try{
            System.out.println( 2 / i );
        }catch (java.lang.Exception e) {
            System.out.println(e.toString());
        }finally {
            System.out.println("m");
        }
    }
}
