package ru.ikbo1319.experement.ex_15;

public class IntegerTest {
    public static void main(String[] args){
        Integer array = new Integer(3);
        for(int i = 0; i < 2; i++){
            array.add(i);
        }
        System.out.println(array.searchMax());
        System.out.println(array.getSize());
        System.out.println(array.middle());
    }
}
