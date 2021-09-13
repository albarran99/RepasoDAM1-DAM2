import org.iesfm.calculator.Calculator;
import org.iesfm.calculator.exceptions.NotANumberException;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculatorTest {

    @Test
    public void sumaNumeroEsperado() {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(4);
        numeros.add(5);

        int result = Calculator.suma(numeros);

        Assert.assertEquals(result, 9);
    }

    @Test
    public void sumaListaVacia() {
        List<Integer> numbers = Arrays.asList();

        int result = Calculator.suma(numbers);

        Assert.assertEquals(0, result);
    }

    @Test
    public void averageCalculatorTest() throws NotANumberException {
        List<Double> numbers = Arrays.asList(3.0, 3.0, 3.0);

        double result = Calculator.avg(numbers);

        Assert.assertEquals(3.0, result, 0.000000000001);
    }

    @Test(expected = NotANumberException.class)
    public void averageIsEmptyTest() throws NotANumberException {
        List<Double> numbers = Arrays.asList();

        double result = Calculator.avg(numbers);

    }


}



