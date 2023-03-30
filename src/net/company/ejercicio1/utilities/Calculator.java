package net.company.ejercicio1.utilities;

import java.util.Arrays;

public class Calculator {
    public static int factorialDeN(int factorialNumber) {
        int factorialTotal = 1;

        for (int i = 1; i < factorialNumber + 1; i++) {
            factorialTotal *= i;
        }

        return factorialTotal;
    }

    public static float mediaHastaN(int averageNumber) {
        float averageTotal = 0f;

        for (int i = 1; i < averageNumber + 1; i++) {
            averageTotal += i;
        }

        return averageTotal / averageNumber;
    }


    public static String obtenerPasosFibonacci(int fibonacciNumber) {
        int addition;
        int accumulator1 = 1;
        int accumulator2 = 1;
        int totalArray[] = new int[fibonacciNumber];
        int counter = 0;


        for (int i = 0; i < fibonacciNumber; i++) {

            if (i == 0) {
                addition = 0;
                totalArray[counter] = addition;
                counter++;

            } else if (i == 1 || i == 2) {
                addition = 1;
                totalArray[counter] = addition;
                counter++;

            } else {
                addition = accumulator1 + accumulator2;
                accumulator1 = accumulator2;
                accumulator2 = addition;
                totalArray[counter] = addition;
                counter++;
            }
        }

        String fibonacciTotal = Arrays.toString(totalArray);


        fibonacciTotal = fibonacciTotal.replace("[", "");
        fibonacciTotal = fibonacciTotal.replace("]", "");

        return fibonacciTotal;
    }
}
