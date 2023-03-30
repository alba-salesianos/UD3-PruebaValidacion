package net.company.ejercicio2.automobile.types;

import net.company.ejercicio2.automobile.Vehicle;

public class Motorbike extends Vehicle {
    private boolean canDriveInHighway;


    public Motorbike(String brand, int weight, int horsepower, int doorNumber, int speed, boolean canDriveInHighway) {
        super(brand, weight, horsepower, doorNumber, speed);
        this.canDriveInHighway = canDriveInHighway;
    }

    public boolean isCanDriveInHighway() {
        return canDriveInHighway;
    }

    public void setCanDriveInHighway(boolean canDriveInHighway) {
        this.canDriveInHighway = canDriveInHighway;
    }

    @Override
    public void accelerate() {
        this.speed += 7;
    }

    @Override
    public String toString() {
        String msg = "----------------------------------------------------------------------------------------------";
        msg += "\n* Tipo de vehículo: Ciclomotor";
        msg += "\n* Marca: " + this.brand;
        msg += "\n* Peso: " + this.weight + " kg";
        msg += "\n* Potencia: " + this.horsepower + "kW";
        msg += "\n* Numero de puertas: " + this.doorNumber;
        if (canDriveInHighway) {
            msg += "\n* Puede ir por autopista: Sí";
        } else {
            msg += "\n* Puede ir por autopista: No";
        }
        msg += "\n* Velocidad actual: " + this.speed + " km/h";
        msg += "\n----------------------------------------------------------------------------------------------";
        return msg;
    }
}
