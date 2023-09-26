package org.example;

import java.awt.*;

public class Car {
    public String brand;
    public String model;
    public String color;
    public int buildYear;
    public int speed;
    public boolean isCurrentlyBeingSold;

    public Car(String brand, String model, String color, int buildYear, int speed, boolean isCurrentlyBeingSold) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.buildYear = buildYear;
        this.speed = speed;
        this.isCurrentlyBeingSold = isCurrentlyBeingSold;
    }

    public static void startCar() {
        System.out.println("Auto wurde gestartet");
    }

    public static void increaseCarSpeed(int speed) {
        speed += 5;

        System.out.println("Auto wurde beschleunigt auf " + speed + " km/h");
    }
}