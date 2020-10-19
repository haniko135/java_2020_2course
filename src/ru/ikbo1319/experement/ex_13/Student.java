package ru.ikbo1319.experement.ex_13;

public class Student {
    private String name;
    private int grade;
    private double[] marks;
    private int ID;

    public Student(String name, int grade, double[] marks, int ID) {
        this.name = name;
        this.grade = grade;
        this.marks = marks;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double[] getMarks() {
        return marks;
    }

    public void setMarks(double[] marks) {
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = marks[i];
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
