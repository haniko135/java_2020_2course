package ru.ikbo1319.experement.ex_23;

public class AllTypesMassive<S> {
    private S[] array;

    public S getArray(int index) {
        return array[index];
    }

    public void setArray(S[] array) {
        this.array = array;
    }
}
