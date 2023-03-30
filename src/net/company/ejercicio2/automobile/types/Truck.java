package net.company.ejercicio2.automobile.types;

import net.company.ejercicio2.automobile.Vehicle;

public class Truck extends Vehicle {
    private int loadCapacity;

    public Truck(String brand, int weight, int horsepower, int doorNumber, int speed, int loadCapacity) {
        super(brand, weight, horsepower, doorNumber, speed);
        this.loadCapacity = loadCapacity;
    }

    public int getLoad() {
        return loadCapacity;
    }

    public void setLoad(int load) {
        this.loadCapacity = load;
    }

    @Override
    public void accelerate() {
        this.speed += 5;
    }

    @Override
    public String toString() {
        String msg = "----------------------------------------------------------------------------------------------";
        msg += "\n* Tipo de vehículo: Ciclomotor";
        msg += "\n* Marca: " + this.brand;
        msg += "\n* Peso: " + this.weight + " kg";
        msg += "\n* Potencia: " + this.horsepower + "kW";
        msg += "\n* Numero de puertas: " + this.doorNumber;
        msg += "\n* Capacidad de carga: " + this.loadCapacity;
        msg += "\n* Velocidad actual: " + this.speed + " km/h";
        msg += "\n----------------------------------------------------------------------------------------------";
        return msg;
    }
}
