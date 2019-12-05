package com.company;

public class Plane extends Vehicle implements Flying {
    public Plane(String name) {
        super(name);
    }

    @Override
    public void go() {

       super.go();
        takeOff();
    }

    @Override
    public double getFuelNeeds() {
        return 200;
    }

    @Override
    public double getDistance() {
        return 400;
    }

    @Override
    public void takeOff() {
        System.out.println("samolot odlatule");
    }

    @Override
    public void land() {
        System.out.println("samolot laduje");
    }

    @Override
    public void callAirControl() {
        System.out.println("Wszytko w porzadku");
    }

    @Override
    public void stop() {
        super.stop();
        land();
    }
}
