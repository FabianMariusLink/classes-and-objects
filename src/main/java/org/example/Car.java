package org.example;

import java.awt.*;

public class Car {
    public String owner;
    public String model;
    public String color;
    public int buildYear;
    public int speed;
    public boolean isCurrentlyBeingSold;

    public Car(String owner, String model, String color, int buildYear, int speed, boolean isCurrentlyBeingSold) {
        this.owner = owner;
        this.model = model;
        this.color = color;
        this.buildYear = buildYear;
        this.speed = speed;
        this.isCurrentlyBeingSold = isCurrentlyBeingSold;
    }

    public void startCar() {
        System.out.println("Auto wurde gestartet");
    }

    public void increaseCarSpeed() {
        speed += 5;

        System.out.println( "Das Auto von " + owner + " wurde beschleunigt auf " + speed + " km/h");
    }
}