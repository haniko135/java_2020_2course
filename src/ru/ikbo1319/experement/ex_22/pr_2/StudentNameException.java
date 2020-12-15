package ru.ikbo1319.experement.ex_22.pr_2;

public class StudentNameException extends Exception{
    public StudentNameException() {
        super("Студент с данным именем не был найден.");
    }
}
