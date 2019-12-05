package com.company;

public class Ship extends Vehicle implements Sailing{
    public Ship(String name) {
        super(name);
    }

    @Override
    public void go() {
        super.go();
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
    public void dock() {
        System.out.println("Statek przybyl do portu");
    }

    @Override
    public void stop() {
        dock();
    }
}
