package ru.ikbo1319.experement.ex_23;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Ex_23 {
    public static <T> List <T> arrToList(T[] array){
        return Arrays.asList(array);
    }

    public static void fileToList(){
        File file = new File("C://Users//Бабушка//IdeaProjects//untitled1//src//ru//ikbo1319//experement//ex_19//java_pr1.txt");
        List<File> fileList = arrToList(file.listFiles());
        try {
            for (int i = 0; i < 5; i++){
                System.out.println(fileList.get(i));
            }
        }catch (Exception e){
            System.out.println("Less than 5");
        }
    }

    public static void main(String[] args){
        Integer[] integers = new Integer[]{7, 54, 254, 12};
        String[] strings = new String[]{"hello", "this", "is", "darkness", "my lil friend"};
        List<String> stringList = arrToList(strings);
        List<Integer> integerList = arrToList(integers);


        AllTypesMassive<String> stringAllTypesMassive = new AllTypesMassive<>();
        stringAllTypesMassive.setArray(strings);
        stringAllTypesMassive.getArray(4);


        fileToList();
    }
}
