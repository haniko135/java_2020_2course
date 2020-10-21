package ru.ikbo1319.experement.ex_13;

import java.util.Arrays;

public class Student{
    private String name;
    private int grade;
    private double[] marks;
    private int iDNumber;
    private double marksGPA;

    public Student(String name, int grade, double[] marks, int iDNumber) {
        this.name = name;
        this.grade = grade;
        this.marks = marks;
        this.iDNumber = iDNumber;
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

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", marks=" + Arrays.toString(marks) +
                ", ID=" + iDNumber +
                '}';
    }

    public double funcMarksGPA(){
        double marksSum = 0;
        for (int i = 0; i < marks.length; i++){
            marksSum += marks[i];
        }
        return marksSum / marks.length;
    }

    public void setMarksGPA(double marksGPA){
        this.marksGPA = funcMarksGPA();
    }

    public double getMarksGPA() {
        return marksGPA;
    }
}
