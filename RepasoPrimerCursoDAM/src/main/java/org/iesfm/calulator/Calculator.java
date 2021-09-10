package org.iesfm.calulator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public static void main(String[] args) {
//        System.out.printf("Hola mundo");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(8);
        numeros.add(6);
        numeros.add(2);

        int suma = suma(numeros);

        System.out.println("el resultado es " + suma);

        List<Double> numeros1 = new ArrayList<>();

        numeros1.add(8.2);
        numeros1.add(6.2);
        numeros1.add(2.2);

        double avg = avg(numeros1);

        System.out.println("el resultado es " + avg);


    }

    public static int suma(List<Integer> numeros) {
        int rest = 0;
        for (int numero : numeros) {
            rest += numero;
        }
        return rest;
    }

    public static double avg(List<Double> numeros) {
        double rest = 0;
        for (double numero : numeros) {
            rest += numero;

        }
        return rest / numeros.size();
    }
}
