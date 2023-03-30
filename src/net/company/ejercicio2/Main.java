package net.company.ejercicio2;

import net.company.ejercicio2.automobile.types.Truck;
import net.company.ejercicio2.automobile.types.Motorbike;

public class Main {
    public static void main(String[] args) {
        Motorbike bike1 = new Motorbike("Yamaha", 100, 4, 0, 0, true);
        Truck truck1 = new Truck("Volvo", 18000, 170, 2, 0, 100);

        bike1.accelerate();
        truck1.accelerate();

        System.out.println(bike1);
        System.out.println(truck1);


    }
}