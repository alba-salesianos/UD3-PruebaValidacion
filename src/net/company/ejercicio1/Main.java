package net.company.ejercicio1;


import net.company.ejercicio1.utilities.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        float userNumber;

        System.out.println("Introduzca un valor numérico entero y positivo:");
        userNumber = keyboard.nextFloat();

        if (userNumber % 1 != 0) {
            System.out.println("Este número no es entero.");
        } else if (userNumber < 0) {
            System.out.println("Este número no es positivo.");
        } else {
            System.out.println(Calculator.factorialDeN((int) userNumber));
            System.out.println(Calculator.mediaHastaN((int) userNumber));
            System.out.println(Calculator.obtenerPasosFibonacci((int) userNumber));

        }
    }
}