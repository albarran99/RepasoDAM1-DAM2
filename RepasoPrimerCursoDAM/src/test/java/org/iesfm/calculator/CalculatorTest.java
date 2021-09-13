package org.iesfm.calculator;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculatorTest {

    @Test
    public  void sumaNumeroEsperado(){
        List<Integer> numeros = new ArrayList<>();

        numeros.add(4);
        numeros.add(5);

        int result = Calculator.suma(numeros);

        Assert.assertEquals(result, 9);
    }


}
