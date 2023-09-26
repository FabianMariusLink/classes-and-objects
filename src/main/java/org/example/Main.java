package org.example;

public class Main {
    public static void main(String[] args) {
        Car dominicsCar = new Car("Dominic", "Van", "white", 2010, 200, true);
        Car enricosCar = new Car("Enrico", "onlyOne", "grey", 1989, 100, false);

        dominicsCar.startCar();
        dominicsCar.increaseCarSpeed();
        System.out.println(dominicsCar.speed);

        enricosCar.startCar();
        enricosCar.increaseCarSpeed();
        System.out.println(enricosCar.speed);


        Person person1 = new Person("Max", 25, "männlich");
        Person person2 = new Person("Anna", 30, "weiblich");
        Person person3 = new Person("Chris", 22, "männlich");

        person1.introduce();
        person2.introduce();
        person3.introduce();


    }
}