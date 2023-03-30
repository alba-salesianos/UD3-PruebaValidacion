package net.company.ejercicio2.automobile;

public class Vehicle {
    protected String brand;
    protected int weight;
    protected int horsepower;
    protected int doorNumber;
    protected int speed;

    public Vehicle(String brand, int weight, int horsepower, int doorNumber, int speed) {
        this.brand = brand;
        this.weight = weight;
        this.horsepower = horsepower;
        this.doorNumber = doorNumber;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate() {
        this.speed += 10;
    }
}
