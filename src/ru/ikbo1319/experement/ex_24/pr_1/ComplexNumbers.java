package ru.ikbo1319.experement.ex_24.pr_1;

public class ComplexNumbers {
    private int imagine;
    private int real;

    public ComplexNumbers(){}

    public ComplexNumbers(int imagine, int real) {
        this.imagine = imagine;
        this.real = real;
    }

    public int getImagine() {
        return imagine;
    }

    public void setImagine(int imagine) {
        this.imagine = imagine;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }
}