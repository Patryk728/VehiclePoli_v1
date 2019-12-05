package com.company;

public class Truck extends Car{
    public Truck(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return super.getFuelNeeds();
    }

    @Override
    public double getDistance() {
        return super.getDistance();
    }

    @Override
    public void go() {

        System.out.println("Ciezarowka rusza");
    }

}
