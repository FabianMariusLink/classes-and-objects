package org.example;

public class Main {
    public static void main(String[] args) {
        Car dominicsCar = new Car("VW", "Van", "white", 2010, 200, true);
        dominicsCar.startCar();
        dominicsCar.increaseCarSpeed(250);
    }
}