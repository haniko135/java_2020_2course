package ru.ikbo1319.experement.ex_22;

public class InnError extends Exception {
    public InnError() {
        super("ІНН має містити 10 цифр. Спробуйте ще раз.");
    }
}
