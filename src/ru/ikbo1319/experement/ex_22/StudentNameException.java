package ru.ikbo1319.experement.ex_22;

public class StudentNameException extends Exception{
    public StudentNameException() {
        super("Студент с данным именем не был найден.");
    }
}
