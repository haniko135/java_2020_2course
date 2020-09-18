package ru.ikbo1319.experement.ex_3.Book_class;

public class Book {
    private String author;
    private int year;
    private String name;
    private String publisher;

    public Book(String author, int year, String name, String publisher){
        this.author = author;
        this.name = name;
        this.publisher = publisher;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", year=" + year +
                ", name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
