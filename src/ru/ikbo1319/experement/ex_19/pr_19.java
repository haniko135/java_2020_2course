package ru.ikbo1319.experement.ex_19;

import java.io.*;
import java.util.Scanner;

public class pr_19 {

    public static void file4(){
        File newFile = new File("C://Users//Бабушка//IdeaProjects//untitled1//src//ru//ikbo1319//experement//ex_19//java_pr1.txt");
        if(!newFile.exists()){
            System.out.println("File don't exists");
        }
        else {
            System.out.println("File exists");

            try (FileWriter writeFile = new FileWriter( "C://Users//Бабушка//IdeaProjects//untitled1//src//ru//ikbo1319//experement//ex_19//java_pr1.txt", false )) {
                Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();
                writeFile.write(str);
                writeFile.append("\n");
                writeFile.flush();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }

        }
    }

    public static void file2(){
        File newFile = new File("C://Users//Бабушка//IdeaProjects//untitled1//src//ru//ikbo1319//experement//ex_19//java_pr1.txt");
        if(!newFile.exists()){
            System.out.println("File don't exists");
        }
        else {
            System.out.println("File exists");

            try (FileReader readFile = new FileReader( "C://Users//Бабушка//IdeaProjects//untitled1//src//ru//ikbo1319//experement//ex_19//java_pr1.txt" )) {
                int c;
                while((c = readFile.read())!=-1){

                    System.out.print((char)c);
                }
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }

        }
    }

    public static void file3(){
        File newFile = new File("C://Users//Бабушка//IdeaProjects//untitled1//src//ru//ikbo1319//experement//ex_19//java_pr1.txt");
        if(!newFile.exists()){
            System.out.println("File don't exists");
        }
        else {
            System.out.println("File exists");

            try (FileWriter writeFile = new FileWriter( "C://Users//Бабушка//IdeaProjects//untitled1//src//ru//ikbo1319//experement//ex_19//java_pr1.txt", true )) {
                Scanner scanner = new Scanner(System.in);
                String str = scanner.nextLine();
                writeFile.write(str);
                writeFile.append("\n");
                writeFile.flush();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }

        }
    }

    public static void file1(){
        File newFile = new File("C://Users//Бабушка//IdeaProjects//untitled1//src//ru//ikbo1319//experement//ex_19//java_pr1.txt");
        if(!newFile.exists()){
            System.out.println("File don't exists");
        }
        else {
            System.out.println("File exists");

            Scanner scanner = new Scanner(System.in);
            String text = "Hello world!";

            try(FileOutputStream writeFile =new FileOutputStream("C://Users//Бабушка//IdeaProjects//untitled1//src//ru//ikbo1319//experement//ex_19//java_pr1.txt"))
            {
                byte[] buff = text.getBytes();
                writeFile.write(buff, 0, buff.length);
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
            System.out.println("The file has been written");

        }
    }

    public static void main(String[] args){
        file1();

    }
}
