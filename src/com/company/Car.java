package com.company;

public class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public double getFuelNeeds() {
        return 2000;
    }

    @Override
    public double getDistance() {
        return 400;
    }

}
