package ru.ikbo1319.experement.ex_24.pr_1;

import ru.ikbo1319.experement.ex_24.pr_1.AbstractFabric;
import ru.ikbo1319.experement.ex_24.pr_1.ComplexNumbers;

public class ComplexPlusAbstractFabric implements AbstractFabric {

    @Override
    public ComplexNumbers setNumbers() {
        ComplexNumbers complex = new ComplexNumbers(2,1);
        return complex;
    }

    @Override
    public ComplexNumbers setNumbers(int real, int img) {
        ComplexNumbers complex = new ComplexNumbers(img, real);
        return complex;
    }
}
