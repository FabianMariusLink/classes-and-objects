package org.example;

public class Main {
    public static void main(String[] args) {
        Car dominicsCar = new Car("VW", "Van", "white", 2010, 0, true);
        Car enricosCar = new Car("Trabant", "onlyOne", "grey", 1989, 0, false);

        dominicsCar.startCar();
        dominicsCar.increaseCarSpeed(250);

        enricosCar.startCar();
        enricosCar.increaseCarSpeed(100);
    }
}