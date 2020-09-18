package ru.ikbo1319.experement.ex_3.Book_class;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Book book = new Book(scanner.nextLine(), scanner.nextInt(), scanner.nextLine(), scanner.nextLine());
        book.getAuthor();
        book.toString();
    }
}
